package net.megaeonise.megaweapons.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;

public class AngleCalc {
    MinecraftClient mc = MinecraftClient.getInstance();

    public static double angleClamp(double angle) {
        if (angle > 360) {
            angle -= 360;
        } else if (angle < 0) {
            angle += 360;
        }
        return angle;
    }

    public double mouseAngle() {
        Mouse mouse = new Mouse(mc);
        double angle = -Math.toDegrees(Math.atan2(mouse.getX() - (mc.getWindow().getWidth() * 0.5D), mouse.getY() - (mc.getWindow().getHeight() * 0.5D)));
        return angle;
    }
}
