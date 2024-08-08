
package net.mcreator.bedrocktools.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.bedrocktools.jei_recipes.ClickExplosionJEIRecipeRecipeCategory;
import net.mcreator.bedrocktools.jei_recipes.ClickExplosionJEIRecipeRecipe;

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

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("bedrock_tools_and_armor:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ClickExplosionJEIRecipeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<ClickExplosionJEIRecipeRecipe> ClickExplosionJEIRecipeRecipes = recipeManager.getAllRecipesFor(ClickExplosionJEIRecipeRecipe.Type.INSTANCE);
		registration.addRecipes(ClickExplosionJEIRecipe_Type, ClickExplosionJEIRecipeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
	}
}
