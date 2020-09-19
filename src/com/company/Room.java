package com.company;

import java.awt.*;

public class Room implements Drawable {

    private Color c;

    public Room(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawRoom(g, c);
    }

    public static void drawRoom(Graphics2D g, Color c) {
        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);
        g.drawRect(86, 50, 1000, 450);
        g.drawLine(0, 0, 84, 50);
        g.drawLine(1200, 0, 1088, 50);
        g.drawLine(0, 700, 85, 500);
        g.drawLine(1200, 700, 1085, 500);
    }
}