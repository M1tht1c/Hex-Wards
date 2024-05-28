package net.hex_wards;

import net.hex_wards.registry.Hex_wardsIotaTypeRegistry;
import net.hex_wards.registry.Hex_wardsItemRegistry;
import net.hex_wards.registry.Hex_wardsPatternRegistry;
import net.hex_wards.networking.Hex_wardsNetworking;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is effectively the loading entrypoint for most of your code, at least
 * if you are using Architectury as intended.
 */
public class Hex_wards {
    public static final String MOD_ID = "hex_wards";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public static void init() {
        LOGGER.info("Hex_wards says hello!");

        Hex_wardsAbstractions.initPlatformSpecific();
        Hex_wardsItemRegistry.init();
        Hex_wardsIotaTypeRegistry.init();
        Hex_wardsPatternRegistry.init();
		Hex_wardsNetworking.init();

        LOGGER.info(Hex_wardsAbstractions.getConfigDirectory().toAbsolutePath().normalize().toString());
    }

    /**
     * Shortcut for identifiers specific to this mod.
     */
    public static ResourceLocation id(String string) {
        return new ResourceLocation(MOD_ID, string);
    }
}
