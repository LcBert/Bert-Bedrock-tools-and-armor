
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bedrocktools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bedrocktools.block.UnstableBedrockBlock;
import net.mcreator.bedrocktools.BedrockToolsAndArmorMod;

public class BedrockToolsAndArmorModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BedrockToolsAndArmorMod.MODID);
	public static final RegistryObject<Block> UNSTABLE_BEDROCK = REGISTRY.register("unstable_bedrock", () -> new UnstableBedrockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
