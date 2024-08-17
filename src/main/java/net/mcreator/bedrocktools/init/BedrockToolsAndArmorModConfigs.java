package net.mcreator.bedrocktools.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.bedrocktools.configuration.BedrockToolsAndArmorConfiguration;
import net.mcreator.bedrocktools.BedrockToolsAndArmorMod;

@Mod.EventBusSubscriber(modid = BedrockToolsAndArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BedrockToolsAndArmorModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BedrockToolsAndArmorConfiguration.SPEC, "bedrock_tools_and_armor-common.toml");
		});
	}
}
