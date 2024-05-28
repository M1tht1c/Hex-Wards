package net.hex_wards.forge;

import net.hex_wards.Hex_wardsClient;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Forge client loading entrypoint.
 */
public class Hex_wardsClientForge {
    public static void init(FMLClientSetupEvent event) {
        Hex_wardsClient.init();
    }
}
