
package net.mcreator.bedrocktools.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.bedrocktools.init.BedrockToolsAndArmorModJeiPlugin;
import net.mcreator.bedrocktools.init.BedrockToolsAndArmorModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class BedrockInfuserJEIRecipeTypeRecipeCategory implements IRecipeCategory<BedrockInfuserJEIRecipeTypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("bedrock_tools_and_armor", "bedrock_infuser_jei_recipe_type");
	public final static ResourceLocation TEXTURE = new ResourceLocation("bedrock_tools_and_armor", "textures/screens/bedrock_infuser_jei_recipe.png");
	private final IDrawable background;
	private final IDrawable icon;

	public BedrockInfuserJEIRecipeTypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 126, 54);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BedrockToolsAndArmorModBlocks.BEDROCK_INFUSER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<BedrockInfuserJEIRecipeTypeRecipe> getRecipeType() {
		return BedrockToolsAndArmorModJeiPlugin.BedrockInfuserJEIRecipeType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Bedrock Infuser");
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
	public void setRecipe(IRecipeLayoutBuilder builder, BedrockInfuserJEIRecipeTypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 1).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 1, 37).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 37).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 55, 19).addItemStack(recipe.getResultItem(null));
	}
}
