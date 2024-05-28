package net.hex_wards.fabric;

import net.fabricmc.loader.api.FabricLoader;
import net.hex_wards.Hex_wardsAbstractions;

import java.nio.file.Path;

public class Hex_wardsAbstractionsImpl {
    /**
     * This is the actual implementation of {@link Hex_wardsAbstractions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
	
    public static void initPlatformSpecific() {
        Hex_wardsConfigFabric.init();
    }
}
