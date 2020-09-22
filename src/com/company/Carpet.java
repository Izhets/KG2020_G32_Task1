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
        drawSquare(g, 430,250,145, 6, -1);
        drawSquare(g, 750,250,145, 6, -1);
    }
    //"Тело ковра"
    public static void drawСarpet(Graphics2D g, Color c) {
        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);
        g.drawRect(222, 100, 730, 300); //Контур ковра
        g.fillRect(222,100,730,300); //Закрашивание всей основы ковра
        g.drawRect(240, 115, 695, 270); //Внутренний первый кант
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
        g.setColor(Color.MAGENTA);
        if(n == 0){g.clearRect(x - size / 2, y - size / 2, size, size);
            g.drawRect(x - size / 2, y - size / 2, size, size);

        }
        else{
            if(mark == -1){
                g.drawRect(x - size / 2, y - size / 2, size, size);
                g.clearRect(x - size / 2, y - size / 2, size, size);
            }
            drawSquare(g, x - size / 2, y - size / 2, size * 9 / 20, n - 1, mark * -1);
            drawSquare(g, x + size / 2, y - size / 2, size * 9 / 20, n - 1, mark * -1);
            drawSquare(g, x - size / 2, y + size / 2, size * 9 / 20, n - 1, mark * -1);
            drawSquare(g, x + size / 2 ,y + size / 2, size * 9 / 20, n - 1, mark * -1);
            if(mark == 1){
                g.drawRect(x - size / 2, y - size / 2, size, size);
                g.clearRect(x - size / 2, y - size / 2, size, size);
            }
        }
    }
}
