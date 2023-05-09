
package net.mcreator.mymod.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mymod.init.MyModModTabs;

public class TheFieldsItem extends RecordItem {
	public TheFieldsItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("my_mod:thefields")), new Item.Properties().tab(MyModModTabs.TAB_FILEDS_OF_MEMORY).stacksTo(1).rarity(Rarity.RARE), 4160);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
