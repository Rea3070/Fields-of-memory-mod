
package net.mcreator.fieldsofmemory.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fieldsofmemory.init.FieldsOfMemoryModTabs;

public class ConfessItem extends RecordItem {
	public ConfessItem() {
		super(6, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fields_of_memory:closer")), new Item.Properties().tab(FieldsOfMemoryModTabs.TAB_FILEDS_OF_MEMORY).stacksTo(1).rarity(Rarity.RARE), 5440);
	}
}
