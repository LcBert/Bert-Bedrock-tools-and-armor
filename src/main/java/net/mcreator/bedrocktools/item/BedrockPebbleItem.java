
package net.mcreator.bedrocktools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BedrockPebbleItem extends Item {
	public BedrockPebbleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
