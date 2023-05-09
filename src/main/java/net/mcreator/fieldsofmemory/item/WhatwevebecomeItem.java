
package net.mcreator.fieldsofmemory.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fieldsofmemory.init.FieldsOfMemoryModTabs;

public class WhatwevebecomeItem extends RecordItem {
	public WhatwevebecomeItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fields_of_memory:whatwevebecome")), new Item.Properties().tab(FieldsOfMemoryModTabs.TAB_FILEDS_OF_MEMORY).stacksTo(1).rarity(Rarity.RARE), 4880);
	}
}
