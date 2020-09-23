package com.company;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Carpet implements Drawable {

    private Color c;

    public Carpet(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawСarpet(g, c);
        //g.setPaint(Color.BLACK);
        drawSquare(g, 430, 250, 145, 4, -1);
        drawSquare(g, 590, 250, 50, 4, -1);
        drawSquare(g, 750, 250, 145, 4, -1);
        //drawSquare(g, 380, 250, 145, 4, -1);
        //drawSquare(g, 590, 250, 110, 4, -1);
        //drawSquare(g, 585, 200, 80,4, -1);
        //drawSquare(g, 585, 300, 80, 4, -1);
        //drawSquare(g, 790, 250, 145, 4, -1);
    }


    //"Тело ковра"
    public static void drawСarpet(Graphics2D g, Color c) {
        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);
        g.drawRect(222, 100, 730, 300); //Контур ковра
        g.fillRect(222, 100, 730, 300); //Закрашивание всей основы ковра
        g.drawRect(240, 115, 695, 270); //Внутренний первый кант
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(240, 115, 695, 270); //Закрашивание всей основы ковра
        g.setColor(Color.RED);

        //Бахрома топ X
        for (int i = 222; i < 950; i += 10) {
            g.fillOval(i, 87, 10, 10);
        }
        //Бахрома давн Х
        for (int i = 222; i < 950; i += 10) {
            g.fillOval(i, 407, 10, 10);
        }
        //Бахрома райт Y
        for (int i = 87; i < 412; i += 10) {
            g.fillOval(210, i, 10, 10);
        }
        //Бахрома лефт Y
        for (int i = 87; i < 412; i += 10) {
            g.fillOval(955, i, 10, 10);
        }
    }

    //Узор ковра
    private void drawSquare(Graphics g, int x, int y, int size, int n, int mark) {
        Graphics2D g2 = (Graphics2D) g;
        if (n == 0) {
            g.clearRect(x - size / 2, y - size / 2, size, size);
            Rectangle2D r1 = new Rectangle2D.Double(x - size / 2, y - size / 2, size, size);
            g2.setPaint(Color.yellow);
            g2.fill(r1);
        } else {
            if (mark == -1) {
                Rectangle2D r2 = new Rectangle2D.Double(x - size / 2, y - size / 2, size, size);
                g.clearRect(x - size / 2, y - size / 2, size, size);
                g2.setPaint(Color.RED);
                g2.fill(r2);
            }
            drawSquare(g, x - size / 2, y - size / 2, size * 9 / 20, n - 1, mark * -1);
            drawSquare(g, x + size / 2, y - size / 2, size * 9 / 20, n - 1, mark * -1);
            drawSquare(g, x - size / 2, y + size / 2, size * 9 / 20, n - 1, mark * -1);
            drawSquare(g, x + size / 2, y + size / 2, size * 9 / 20, n - 1, mark * -1);
            if (mark == 1) {
                Rectangle2D r3 = new Rectangle2D.Double(x - size / 2, y - size / 2, size, size);
                g2.setPaint(Color.ORANGE);
                g.clearRect(x - size / 2, y - size / 2, size, size);
                g2.fill(r3);
            }
        }
    }
}
