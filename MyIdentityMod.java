package com.adityamod;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class MyIdentityMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MinecraftClient client = MinecraftClient.getInstance();
        client.execute(() -> {
            if (client.currentScreen == null) {
                client.setScreen(new AdityaScreen());
            }
        });
    }
}
