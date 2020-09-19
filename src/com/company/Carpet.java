package com.company;

import java.awt.*;

public class Carpet implements Drawable {

    private Color c;

    public Carpet(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawСarpet(g, c);
    }

    public static void drawСarpet(Graphics2D g, Color c) {
        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);
        g.drawRect(222, 100, 730, 300); //контур ковра
        g.drawRect(240, 115, 695, 270); //внутренний первый кант
    }
}
