package com.company;

import java.awt.*;

public class Table implements Drawable {

    private Color c;

    public Table(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawTable(g, c);
    }

    public static void drawTable(Graphics2D g, Color c) {

        g.setPaint(Color.BLACK);
        Polygon p1 = new Polygon();
        p1.addPoint(614, 367);
        p1.addPoint(994, 367);
        p1.addPoint(973, 472);
        p1.addPoint(581, 472);
        g.drawPolygon(p1);
        g.fillPolygon(p1);

        g.setPaint(Color.BLACK);
        g.fillRect(610, 367, 30, 150);
        g.fillRect(964, 367, 30, 150);
        g.fillRect(943, 472, 30, 150);
        g.fillRect(580, 472, 30, 150);

        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(5);
        g.setStroke(sizeLine);

        Polygon p2 = new Polygon();
        p2.addPoint(614, 367);
        p2.addPoint(994, 367);
        p2.addPoint(973, 472);
        p2.addPoint(581, 472);
        g.drawPolygon(p2);
    }
}