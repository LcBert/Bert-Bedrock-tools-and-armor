package net.mcreator.bedrocktools.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.bedrocktools.network.BedrockToolsAndArmorModVariables;
import net.mcreator.bedrocktools.configuration.BedrockToolsAndArmorConfiguration;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UpdateSlownessBedrockArmorFromConfigFileProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		BedrockToolsAndArmorModVariables.WorldVariables.get(world).slowness_bedrock_armor = BedrockToolsAndArmorConfiguration.SLOWNESS.get();
		BedrockToolsAndArmorModVariables.WorldVariables.get(world).syncData(world);
	}
}
