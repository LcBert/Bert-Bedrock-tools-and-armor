
package net.mcreator.bedrocktools.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.bedrocktools.jei_recipes.ClickExplosionJEIRecipeRecipeCategory;
import net.mcreator.bedrocktools.jei_recipes.ClickExplosionJEIRecipeRecipe;
import net.mcreator.bedrocktools.jei_recipes.BedrockInfuserJEIRecipeTypeRecipeCategory;
import net.mcreator.bedrocktools.jei_recipes.BedrockInfuserJEIRecipeTypeRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class BedrockToolsAndArmorModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<ClickExplosionJEIRecipeRecipe> ClickExplosionJEIRecipe_Type = new mezz.jei.api.recipe.RecipeType<>(ClickExplosionJEIRecipeRecipeCategory.UID, ClickExplosionJEIRecipeRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<BedrockInfuserJEIRecipeTypeRecipe> BedrockInfuserJEIRecipeType_Type = new mezz.jei.api.recipe.RecipeType<>(BedrockInfuserJEIRecipeTypeRecipeCategory.UID, BedrockInfuserJEIRecipeTypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("bedrock_tools_and_armor:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ClickExplosionJEIRecipeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new BedrockInfuserJEIRecipeTypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<ClickExplosionJEIRecipeRecipe> ClickExplosionJEIRecipeRecipes = recipeManager.getAllRecipesFor(ClickExplosionJEIRecipeRecipe.Type.INSTANCE);
		registration.addRecipes(ClickExplosionJEIRecipe_Type, ClickExplosionJEIRecipeRecipes);
		List<BedrockInfuserJEIRecipeTypeRecipe> BedrockInfuserJEIRecipeTypeRecipes = recipeManager.getAllRecipesFor(BedrockInfuserJEIRecipeTypeRecipe.Type.INSTANCE);
		registration.addRecipes(BedrockInfuserJEIRecipeType_Type, BedrockInfuserJEIRecipeTypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(BedrockToolsAndArmorModBlocks.BEDROCK_INFUSER.get().asItem()), BedrockInfuserJEIRecipeType_Type);
	}
}
