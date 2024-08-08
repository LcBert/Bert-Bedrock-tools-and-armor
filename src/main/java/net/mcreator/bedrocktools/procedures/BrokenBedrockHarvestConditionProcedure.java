package net.mcreator.bedrocktools.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bedrocktools.init.BedrockToolsAndArmorModItems;

public class BrokenBedrockHarvestConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BedrockToolsAndArmorModItems.BEDROCK_PICKAXE.get();
	}
}
