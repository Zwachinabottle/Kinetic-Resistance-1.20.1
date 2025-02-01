package net.zwachinabottle.kineticresistance.forge.Init;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zwachinabottle.kineticresistance.KineticResistance;
import net.zwachinabottle.kineticresistance.enchantment.KineticResistanceEnchantment;

public class enchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, KineticResistance.MOD_ID);

    public static final RegistryObject<Enchantment> KINETIC_RESISTANCE = ENCHANTMENTS.register("kinetic_resistance", KineticResistanceEnchantment::new);
}
