
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrocktools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.bedrocktools.world.inventory.BedrockInfuserGUIMenu;
import net.mcreator.bedrocktools.BedrockToolsAndArmorMod;

public class BedrockToolsAndArmorModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BedrockToolsAndArmorMod.MODID);
	public static final RegistryObject<MenuType<BedrockInfuserGUIMenu>> BEDROCK_INFUSER_GUI = REGISTRY.register("bedrock_infuser_gui", () -> IForgeMenuType.create(BedrockInfuserGUIMenu::new));
}
