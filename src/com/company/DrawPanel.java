package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        //drawSun(gr, 130, 110, 40, 70, 35);
        drawRoom(gr, Color.BLACK);

    }

    public static void drawSun(Graphics2D g, int x, int y, int r, int R, int n) {
        g.setColor(Color.CYAN);
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

    public static void drawRoom(Graphics2D g, Color c) {
        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);
        g.drawRect(86, 50, 1000, 450);
        g.drawLine(0,0,84, 50);
        g.drawLine(1200,0,1088, 50);
        g.drawLine(0,700,94, 595);
        g.drawLine(0,0,84, 50);
    }

    public static void drawTable(Graphics2D g, Color c) {
        g.setColor(c);
        g.drawRect(100, 100, 30, 50);
    }

}
