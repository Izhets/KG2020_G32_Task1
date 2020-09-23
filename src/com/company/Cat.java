package com.company;

import java.awt.*;

public class Cat implements Drawable {

    private Color c;

    public Cat(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawCat(g, c);

    }

    public static void drawCat(Graphics2D g, Color c) {
        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);
        g.drawRect(86, 50, 1000, 450);
        g.drawLine(0, 0, 84, 50);
    }

}
