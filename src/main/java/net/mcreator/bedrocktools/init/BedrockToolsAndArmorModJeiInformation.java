
package net.mcreator.bedrocktools.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class BedrockToolsAndArmorModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("bedrock_tools_and_armor:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(BedrockToolsAndArmorModItems.BEDROCK_PEBBLE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.bedrock_tools_and_armor.bedrock_pebble_jei_information"));
		registration.addIngredientInfo(List.of(new ItemStack(BedrockToolsAndArmorModItems.BEDROCK_UPGRADE_SMITHING_TEMPLATE.get())), VanillaTypes.ITEM_STACK,
				Component.translatable("jei.bedrock_tools_and_armor.bedrock_smithing_template_jei_information"));
		registration.addIngredientInfo(List.of(new ItemStack(BedrockToolsAndArmorModItems.BEDROCK_AMULET.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.bedrock_tools_and_armor.bedrock_amulet_jei_information"));
		registration.addIngredientInfo(List.of(new ItemStack(BedrockToolsAndArmorModBlocks.BEDROCK_INFUSER.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.bedrock_tools_and_armor.bedrock_infuser_jei_information"));
	}
}
