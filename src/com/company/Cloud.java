package com.company;

import java.awt.*;

public class Cloud implements Drawable {

    private Color c;

    public Cloud(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawCloud(g, c);
    }

    public static void drawCloud(Graphics2D g, Color c) {
        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);
        g.fillOval(725, 160, 118, 90);
        g.fillOval(800, 190, 84, 74);
        g.fillOval(760, 200, 69, 64);

        Polygon p1 = new Polygon();
        p1.addPoint(735, 231);
        p1.addPoint(723, 247);
        p1.addPoint(757, 238);
        g.fillPolygon(p1);

        g.setColor(Color.BLACK);
        g.drawString("Белые ходоки идут...", 735, 210);
        g.drawString("Зима близко.", 780, 235);
    }
}