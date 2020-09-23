package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private Sun s = new Sun (130, 110,40,70,35, Color.BLACK);
    private Room r = new Room(Color.darkGray);
    private Carpet c = new Carpet (Color.darkGray);
    private Table t = new Table (Color.darkGray);
    private Cat cat = new Cat (Color.LIGHT_GRAY);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        //s.draw(gr);
        r.draw(gr);
        c.draw(gr);
        t.draw(gr);
        cat.draw(gr);

        //drawRoom(gr, Color.BLACK);
        //drawCarpet(gr, Color.BLACK);
    }



//    //рисуем границы комнаты
//    public static void drawRoom(Graphics2D g, Color c) {
//        g.setColor(c);
//        BasicStroke sizeLine = new BasicStroke(3);
//        g.setStroke(sizeLine);
//        g.drawRect(86, 50, 1000, 450);
//        g.drawLine(0,0,84, 50);
//        g.drawLine(1200,0,1088, 50);
//        g.drawLine(0,700,85, 500);
//        g.drawLine(1200,700,1085, 500);
//    }

//    //рисуем ковер на стене
//    public static void drawCarpet(Graphics2D g, Color c) {
//        g.setColor(c);
//        BasicStroke sizeLine = new BasicStroke(3);
//        g.setStroke(sizeLine);
//        g.drawRect(222, 100, 730, 300); //контур ковра
//        g.drawRect(240, 115, 695, 270); //внутренний первый кант
//    }

    //рисуем окно на стене
//    public static void drawWindow(Graphics2D g, Color c) {
//        g.setColor(c);
//        BasicStroke sizeLine = new BasicStroke(3);
//        g.setStroke(sizeLine);
//
//    }


//    public static void drawTable(Graphics2D g, Color c) {
//        g.setColor(c);
//        g.drawRect(100, 100, 30, 50);
//    }

}
