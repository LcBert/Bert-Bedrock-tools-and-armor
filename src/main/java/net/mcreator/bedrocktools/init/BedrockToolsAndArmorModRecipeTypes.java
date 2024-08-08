package net.mcreator.bedrocktools.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.mcreator.bedrocktools.jei_recipes.ClickExplosionJEIRecipeRecipe;
import net.mcreator.bedrocktools.BedrockToolsAndArmorMod;

@Mod.EventBusSubscriber(modid = BedrockToolsAndArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockToolsAndArmorModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "bedrock_tools_and_armor");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("click_explosion_jei_recipe", () -> ClickExplosionJEIRecipeRecipe.Serializer.INSTANCE);
		});
	}
}
