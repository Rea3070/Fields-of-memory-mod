
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fieldsofmemory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fieldsofmemory.FieldsOfMemoryMod;

public class FieldsOfMemoryModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FieldsOfMemoryMod.MODID);
	public static final RegistryObject<SoundEvent> CLOSER = REGISTRY.register("closer", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "closer")));
	public static final RegistryObject<SoundEvent> THEFIELDS = REGISTRY.register("thefields", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "thefields")));
	public static final RegistryObject<SoundEvent> THEYDONTFEAR = REGISTRY.register("theydontfear", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "theydontfear")));
	public static final RegistryObject<SoundEvent> PASLM = REGISTRY.register("paslm", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "paslm")));
	public static final RegistryObject<SoundEvent> PERSONALDOOM = REGISTRY.register("personaldoom", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "personaldoom")));
	public static final RegistryObject<SoundEvent> FINDYOU = REGISTRY.register("findyou", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "findyou")));
	public static final RegistryObject<SoundEvent> IMSCARED = REGISTRY.register("imscared", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "imscared")));
	public static final RegistryObject<SoundEvent> CONFESS = REGISTRY.register("confess", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "confess")));
	public static final RegistryObject<SoundEvent> WHATWEVEBECOME = REGISTRY.register("whatwevebecome", () -> new SoundEvent(new ResourceLocation("fields_of_memory", "whatwevebecome")));
}
