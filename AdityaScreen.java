package com.adityamod;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;

public class AdityaScreen extends Screen {
    protected AdityaScreen() {
        super(Text.literal("Identity Check"));
    }

    @Override
    protected void init() {
        int centerX = this.width / 2;
        int centerY = this.height / 2;

        this.addDrawableChild(ButtonWidget.builder(Text.literal("This is Aditya"), button -> {
            MinecraftClient.getInstance().setScreen(null);
        }).dimensions(centerX - 100, centerY, 200, 20).build());

        this.addDrawableChild(ButtonWidget.builder(Text.literal("I'm not"), button -> {
            MinecraftClient.getInstance().scheduleStop();
        }).dimensions(centerX - 100, centerY + 30, 200, 20).build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        context.drawCenteredText(this.textRenderer, "If you are not Aditya Pramod, please close this!", this.width / 2, this.height / 2 - 40, 0xFFFFFF);
        super.render(context, mouseX, mouseY, delta);
    }
}
