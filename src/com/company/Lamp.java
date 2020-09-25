package com.company;

import java.awt.*;

public class Lamp implements Drawable {

    private Color c;

    public Lamp(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        //drawBulb(g, c);
        drawSun(g, Color.YELLOW);
        drawLamp(g, c);

    }

    public static void drawSun(Graphics2D g, Color c) {
        g.setColor(c);
        int x = 589;
        int y = 165;
        int r = 15;
        int R = 25;
        int n = 40;
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
        }
    }

    public static void drawBulb(Graphics2D g, Color c) {
        g.setColor(Color.ORANGE);
        BasicStroke sizeLine = new BasicStroke(4);
        g.setStroke(sizeLine);
        g.drawOval(456, 130, 30, 40);
        g.setColor(Color.YELLOW);
        g.fillOval(456, 130, 30, 40);
    }

    public static void drawLamp(Graphics2D g, Color c) {
        g.setColor(Color.BLACK);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);
        g.drawLine(589, 0, 589, 150);
        g.drawArc(514, 120, 150, 100, 0, 180);
        g.setColor(Color.GRAY);
        g.fillArc(514, 120, 150, 100, 0, 180);
    }

}