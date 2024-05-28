package net.hex_wards.forge;

import dev.architectury.platform.forge.EventBuses;
import net.hex_wards.Hex_wards;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * This is your loading entrypoint on forge, in case you need to initialize
 * something platform-specific.
 */
@Mod(Hex_wards.MOD_ID)
public class Hex_wardsForge {
    public Hex_wardsForge() {
        // Submit our event bus to let architectury register our content on the right time
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(Hex_wards.MOD_ID, bus);
        bus.addListener(Hex_wardsClientForge::init);
        Hex_wards.init();
    }
}
