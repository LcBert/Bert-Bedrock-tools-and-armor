
package net.mcreator.bedrocktools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BedrockUpgradeSmithingTemplateItem extends Item {
	public BedrockUpgradeSmithingTemplateItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
