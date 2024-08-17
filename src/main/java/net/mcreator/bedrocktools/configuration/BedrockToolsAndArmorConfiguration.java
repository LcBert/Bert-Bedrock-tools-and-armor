package net.mcreator.bedrocktools.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class BedrockToolsAndArmorConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;
	public static final ForgeConfigSpec.ConfigValue<Boolean> SLOWNESS;
	static {
		BUILDER.push("Bedrock Armor");
		SLOWNESS = BUILDER.comment("Defines whether bedrock armor will grant slowness or not\nDefault: true").define("slowness", true);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
