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
        drawWindow(g, c);
        drawDoor(g, c);
    }

    public static void drawRoom(Graphics2D g, Color c) {
        g.setColor(Color.BLACK);
        BasicStroke sizeLine = new BasicStroke(4);
        g.setStroke(sizeLine);

        g.drawRect(88, 50, 995, 450);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(91,53, 990, 445);

        g.setPaint(Color.LIGHT_GRAY);
        Polygon rightWall = new Polygon();
        rightWall.addPoint(0,0);
        rightWall.addPoint(84,50);
        rightWall.addPoint(84,500);
        rightWall.addPoint(0,700);
        g.drawPolygon(rightWall);
        g.fillPolygon(rightWall);

        g.setPaint(Color.LIGHT_GRAY);
        Polygon leftWall = new Polygon();
        leftWall.addPoint(1088,50);
        leftWall.addPoint(1200,0);
        leftWall.addPoint(1200,700);
        leftWall.addPoint(1088,500);
        g.drawPolygon(leftWall);
        g.fillPolygon(leftWall);

        g.setColor(Color.BLACK);
        g.drawLine(0, 0, 84, 50);
        g.drawLine(1200, 0, 1088, 50);
        g.drawLine(0, 700, 86, 500);
        g.drawLine(1200, 700, 1085, 500);

        Color colorFloor = new Color(142, 72, 34);
        g.setPaint(colorFloor);
        Polygon floor = new Polygon();
        floor.addPoint(4,701);
        floor.addPoint(89,503);
        floor.addPoint(1083,503);
        floor.addPoint(1200,701);
        g.drawPolygon(floor);
        g.fillPolygon(floor);
    }

    public static void drawWindow(Graphics2D g, Color c) {
        g.setPaint(Color.cyan);
        Polygon p1 = new Polygon();
        p1.addPoint(49, 400);
        p1.addPoint(0, 500);
        p1.addPoint(0, 110);
        p1.addPoint(49, 130);
        g.drawPolygon(p1);
        g.fillPolygon(p1);


        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(5);
        g.setStroke(sizeLine);

        Polygon p2 = new Polygon();
        p2.addPoint(49, 400);
        p2.addPoint(0, 500);
        p2.addPoint(0, 110);
        p2.addPoint(49, 130);
        g.drawPolygon(p2);
        //g.fillPolygon(p2);

        g.drawLine(49,260,0,345);
        g.drawLine(20,119,20,455);
    }

    public static void drawDoor(Graphics2D g, Color c) {
        g.setColor(c);
        BasicStroke sizeLine = new BasicStroke(5);
        g.setStroke(sizeLine);

        g.setPaint(Color.DARK_GRAY);
        Polygon p1 = new Polygon();
        p1.addPoint(1120, 124);
        p1.addPoint(1200, 98);
        p1.addPoint(1200, 700);
        p1.addPoint(1120, 557);

        g.drawPolygon(p1);
        g.fillPolygon(p1);

        g.setPaint(Color.BLACK);
        Polygon p2 = new Polygon();
        p2.addPoint(1120, 124);
        p2.addPoint(1200, 98);
        p2.addPoint(1200, 700);
        p2.addPoint(1120, 557);

        g.drawPolygon(p2);

        g.setPaint(Color.BLACK);
        Polygon p3 = new Polygon();
        p3.addPoint(1136, 325);
        p3.addPoint(1145, 330);
        p3.addPoint(1145, 390);
        p3.addPoint(1136, 380);

        g.drawPolygon(p3);

    }

}