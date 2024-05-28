package net.hex_wards.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.hex_wards.Hex_wardsClient;

/**
 * Fabric client loading entrypoint.
 */
public class Hex_wardsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Hex_wardsClient.init();
    }
}
