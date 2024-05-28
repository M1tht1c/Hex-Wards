package net.hex_wards.forge;

import net.hex_wards.Hex_wardsAbstractions;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class Hex_wardsAbstractionsImpl {
    /**
     * This is the actual implementation of {@link Hex_wardsAbstractions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
	
    public static void initPlatformSpecific() {
        Hex_wardsConfigForge.init();
    }
}
