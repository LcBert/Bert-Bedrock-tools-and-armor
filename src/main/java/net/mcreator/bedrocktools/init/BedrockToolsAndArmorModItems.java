
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrocktools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bedrocktools.item.BedrockUpgradeSmithingTemplateItem;
import net.mcreator.bedrocktools.item.BedrockSwordItem;
import net.mcreator.bedrocktools.item.BedrockShovelItem;
import net.mcreator.bedrocktools.item.BedrockPickaxeItem;
import net.mcreator.bedrocktools.item.BedrockPebbleItem;
import net.mcreator.bedrocktools.item.BedrockHoeItem;
import net.mcreator.bedrocktools.item.BedrockHarmorItem;
import net.mcreator.bedrocktools.item.BedrockAxeItem;
import net.mcreator.bedrocktools.BedrockToolsAndArmorMod;

public class BedrockToolsAndArmorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BedrockToolsAndArmorMod.MODID);
	public static final RegistryObject<Item> BEDROCK_SWORD = REGISTRY.register("bedrock_sword", () -> new BedrockSwordItem());
	public static final RegistryObject<Item> BEDROCK_PICKAXE = REGISTRY.register("bedrock_pickaxe", () -> new BedrockPickaxeItem());
	public static final RegistryObject<Item> BEDROCK_AXE = REGISTRY.register("bedrock_axe", () -> new BedrockAxeItem());
	public static final RegistryObject<Item> BEDROCK_SHOVEL = REGISTRY.register("bedrock_shovel", () -> new BedrockShovelItem());
	public static final RegistryObject<Item> BEDROCK_HOE = REGISTRY.register("bedrock_hoe", () -> new BedrockHoeItem());
	public static final RegistryObject<Item> BEDROCK_HARMOR_HELMET = REGISTRY.register("bedrock_harmor_helmet", () -> new BedrockHarmorItem.Helmet());
	public static final RegistryObject<Item> BEDROCK_HARMOR_CHESTPLATE = REGISTRY.register("bedrock_harmor_chestplate", () -> new BedrockHarmorItem.Chestplate());
	public static final RegistryObject<Item> BEDROCK_HARMOR_LEGGINGS = REGISTRY.register("bedrock_harmor_leggings", () -> new BedrockHarmorItem.Leggings());
	public static final RegistryObject<Item> BEDROCK_HARMOR_BOOTS = REGISTRY.register("bedrock_harmor_boots", () -> new BedrockHarmorItem.Boots());
	public static final RegistryObject<Item> BEDROCK_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("bedrock_upgrade_smithing_template", () -> new BedrockUpgradeSmithingTemplateItem());
	public static final RegistryObject<Item> BEDROCK_PEBBLE = REGISTRY.register("bedrock_pebble", () -> new BedrockPebbleItem());
	// Start of user code block custom items
	// End of user code block custom items
}
