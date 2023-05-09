
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fieldsofmemory.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FieldsOfMemoryModTabs {
	public static CreativeModeTab TAB_FILEDS_OF_MEMORY;

	public static void load() {
		TAB_FILEDS_OF_MEMORY = new CreativeModeTab("tabfileds_of_memory") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FieldsOfMemoryModBlocks.FIELDSOFMEMEORY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
