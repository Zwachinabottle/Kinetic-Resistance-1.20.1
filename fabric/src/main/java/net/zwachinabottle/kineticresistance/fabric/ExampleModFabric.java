package net.zwachinabottle.kineticresistance.fabric;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zwachinabottle.kineticresistance.KineticResistance;

import static net.zwachinabottle.kineticresistance.KineticResistance.KINETIC_RESISTANCE;

public final class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        KineticResistance.onInitialize();
        Registry.register(Registries.ENCHANTMENT, new Identifier("kineticresistance", "kinetic_resistance"), KINETIC_RESISTANCE);
    }
}
