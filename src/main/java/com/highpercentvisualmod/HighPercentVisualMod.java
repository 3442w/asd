package com.highpercentvisualmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class HighPercentVisualMod implements ClientModInitializer {
    public static boolean enabled = true;

    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((stack, context, lines) -> {
            for (int i = 0; i < lines.size(); i++) {
                String s = lines.get(i).getString();
                if (s.contains("Dodatkowe obrażenia")) {
                    lines.set(i, Text.literal("Dodatkowe obrażenia 41%").formatted(Formatting.RED));
                }
            }
        });
    }
}
