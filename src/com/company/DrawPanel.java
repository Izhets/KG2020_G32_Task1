package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private Room room = new Room(Color.darkGray);
    private Carpet carpet = new Carpet(Color.darkGray);
    private Table table = new Table(Color.darkGray);
    private Cat cat = new Cat(Color.LIGHT_GRAY);
    private Lamp lamp = new Lamp(Color.LIGHT_GRAY);
    private Cloud cloud = new Cloud(Color.white);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        room.draw(gr);
        carpet.draw(gr);
        table.draw(gr);
        cat.draw(gr);
        lamp.draw(gr);
        cloud.draw(gr);
    }

}
