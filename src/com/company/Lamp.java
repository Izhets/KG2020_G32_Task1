package com.company;

import java.awt.*;

public class Lamp implements Drawable {

    private Color c;

    public Lamp(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawSun(g, Color.YELLOW);
        drawLamp(g, c);
        lampGradient(g);
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

    public void lampGradient(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int w = 120;
        int h = 600;

        // Vertical
        GradientPaint gp = new GradientPaint(
                0, 0, new Color(0, 0, 0, 0),
                0, h, Color.black);

        // Horizontal
        GradientPaint gp2 = new GradientPaint(
                0, 0, Color.BLACK,
                w, 0, Color.lightGray, true);

        g2d.setPaint(gp2);
        g2d.fillArc(514, 120, 150, 100, 0, 180);

        g2d.setPaint(gp);
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