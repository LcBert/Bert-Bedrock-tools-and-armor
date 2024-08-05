
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrocktools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.bedrocktools.BedrockToolsAndArmorMod;

public class BedrockToolsAndArmorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BedrockToolsAndArmorMod.MODID);
	public static final RegistryObject<CreativeModeTab> BEDROCK_TOOLS_CREATIVE_TAB = REGISTRY.register("bedrock_tools_creative_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.bedrock_tools_and_armor.bedrock_tools_creative_tab")).icon(() -> new ItemStack(BedrockToolsAndArmorModItems.BEDROCK_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_SWORD.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_PICKAXE.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_AXE.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_SHOVEL.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_HOE.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_ARMOR_HELMET.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_ARMOR_CHESTPLATE.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_ARMOR_LEGGINGS.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_ARMOR_BOOTS.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_PEBBLE.get());
				tabData.accept(BedrockToolsAndArmorModBlocks.UNSTABLE_BEDROCK.get().asItem());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(BedrockToolsAndArmorModItems.BEDROCK_AMULET.get());
			})

			.build());
}
