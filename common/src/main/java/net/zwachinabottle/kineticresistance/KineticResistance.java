package net.zwachinabottle.kineticresistance;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zwachinabottle.kineticresistance.enchantment.KineticResistanceEnchantment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KineticResistance {
	public static final KineticResistanceEnchantment KINETIC_RESISTANCE = new KineticResistanceEnchantment();

	public static final String MOD_ID = "kineticresistance";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void onInitialize() {
	}
}