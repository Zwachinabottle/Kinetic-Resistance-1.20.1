package net.zwachinabottle.kineticresistance.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.zwachinabottle.kineticresistance.KineticResistance;
import net.zwachinabottle.kineticresistance.forge.Init.enchantmentInit;

@Mod(KineticResistance.MOD_ID)
public final class ExampleModForge {
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public ExampleModForge() {

        KineticResistance.onInitialize();
        enchantmentInit.ENCHANTMENTS.register(modEventBus);
    }
}
