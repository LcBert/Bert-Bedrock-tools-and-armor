package net.mcreator.bedrocktools.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.NonNullList;
import net.minecraft.core.BlockPos;

import net.mcreator.bedrocktools.jei_recipes.ClickExplosionJEIRecipeRecipe;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class ReadClickExplosionJEIRecipeProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState input_block_1 = Blocks.AIR.defaultBlockState();
		BlockState input_block_2 = Blocks.AIR.defaultBlockState();
		ItemStack result_item = ItemStack.EMPTY;
		input_block_1 = (world.getBlockState(BlockPos.containing(x, y, z)));
		input_block_2 = (world.getBlockState(BlockPos.containing(x, y - 2, z)));
		result_item = (new Object() {
			public ItemStack getResult() {
				if (world instanceof Level _lvl) {
					net.minecraft.world.item.crafting.RecipeManager rm = _lvl.getRecipeManager();
					List<ClickExplosionJEIRecipeRecipe> recipes = rm.getAllRecipesFor(ClickExplosionJEIRecipeRecipe.Type.INSTANCE);
					for (ClickExplosionJEIRecipeRecipe recipe : recipes) {
						NonNullList<Ingredient> ingredients = recipe.getIngredients();
						if (!ingredients.get(0).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock()))))
							continue;
						if (!ingredients.get(1).test((new ItemStack((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock()))))
							continue;
						return recipe.getResultItem(null);
					}
				}
				return ItemStack.EMPTY;
			}
		}.getResult());
		if (!(result_item.getItem() == Blocks.AIR.asItem()) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y - 1, z), input_block_1, 3);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y - 1), (z + 0.5), result_item);
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			if (!(world.getBlockState(BlockPos.containing(x, y - 3, z))).is(BlockTags.create(new ResourceLocation("minecraft:wool")))) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, (x + 0.5), (y - 1), (z + 0.5), 100, 0.3, 0.3, 0.3, 0.1);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.AMBIENT, 1, 1);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.AMBIENT, 1, 1, false);
					}
				}
			}
		}
	}
}
