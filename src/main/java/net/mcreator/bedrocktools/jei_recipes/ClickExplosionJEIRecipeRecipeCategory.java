
package net.mcreator.bedrocktools.jei_recipes;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.bedrocktools.init.BedrockToolsAndArmorModJeiPlugin;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class ClickExplosionJEIRecipeRecipeCategory implements IRecipeCategory<ClickExplosionJEIRecipeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("bedrock_tools_and_armor", "click_explosion_jei_recipe");
	public final static ResourceLocation TEXTURE = new ResourceLocation("bedrock_tools_and_armor", "textures/screens/clickexplosionjeigui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public ClickExplosionJEIRecipeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 83, 66);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(Blocks.TNT.asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<ClickExplosionJEIRecipeRecipe> getRecipeType() {
		return BedrockToolsAndArmorModJeiPlugin.ClickExplosionJEIRecipe_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Click Explosion");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, ClickExplosionJEIRecipeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 7, 7).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 7, 43).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 60, 25).addItemStack(recipe.getResultItem(null));
	}
}
