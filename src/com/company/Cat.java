package com.company;

import org.w3c.dom.css.RGBColor;

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
        Color catBody = new Color(128, 116, 128);
        g.setPaint(catBody);
        Polygon pCat = new Polygon();
        pCat.addPoint(659, 233);
        pCat.addPoint(670, 253);
        pCat.addPoint(678, 240);
        pCat.addPoint(684, 250);
        pCat.addPoint(688, 282);
        pCat.addPoint(709, 304);
        pCat.addPoint(725, 304);
        pCat.addPoint(773, 331);
        pCat.addPoint(800, 359);
        pCat.addPoint(809, 386);
        pCat.addPoint(835, 397);
        pCat.addPoint(900, 401);
        pCat.addPoint(922, 392);
        pCat.addPoint(916, 408);
        pCat.addPoint(900, 413);
        pCat.addPoint(851, 417);
        pCat.addPoint(796, 412);
        pCat.addPoint(780, 417);
        pCat.addPoint(772, 416);
        pCat.addPoint(695, 421);
        pCat.addPoint(690, 420);
        pCat.addPoint(690, 417);
        pCat.addPoint(690, 412);
        pCat.addPoint(700, 409);
        pCat.addPoint(692, 380);
        pCat.addPoint(687, 366);
        pCat.addPoint(660, 342);
        pCat.addPoint(655, 329);
        pCat.addPoint(654, 318);
        pCat.addPoint(650, 294);
        pCat.addPoint(645, 285);
        pCat.addPoint(638, 285);
        pCat.addPoint(632, 278);
        pCat.addPoint(630, 269);
        pCat.addPoint(642, 264);
        pCat.addPoint(643, 256);
        pCat.addPoint(655, 250);
        pCat.addPoint(659, 234);
        g.drawPolygon(pCat);
        g.fillPolygon(pCat);

        Color catLine = new Color(224, 185, 217);

        g.setPaint(catLine);
        BasicStroke sizeLine = new BasicStroke(3);
        g.setStroke(sizeLine);

        Polygon pCat2 = new Polygon();
        pCat2.addPoint(659, 233);
        pCat2.addPoint(670, 253);
        pCat2.addPoint(678, 240);
        pCat2.addPoint(684, 250);
        pCat2.addPoint(688, 282);
        pCat2.addPoint(709, 304);
        pCat2.addPoint(725, 304);
        pCat2.addPoint(773, 331);
        pCat2.addPoint(800, 359);
        pCat2.addPoint(809, 386);
        pCat2.addPoint(835, 397);
        pCat2.addPoint(900, 401);
        pCat2.addPoint(922, 392);
        pCat2.addPoint(916, 408);
        pCat2.addPoint(900, 413);
        pCat2.addPoint(851, 417);
        pCat2.addPoint(796, 412);
        pCat2.addPoint(780, 417);
        pCat2.addPoint(772, 416);
        pCat2.addPoint(695, 421);
        pCat2.addPoint(690, 420);
        pCat2.addPoint(690, 417);
        pCat2.addPoint(690, 412);
        pCat2.addPoint(700, 409);
        pCat2.addPoint(692, 380);
        pCat2.addPoint(687, 366);
        pCat2.addPoint(660, 342);
        pCat2.addPoint(655, 329);
        pCat2.addPoint(654, 318);
        pCat2.addPoint(650, 294);
        pCat2.addPoint(645, 285);
        pCat2.addPoint(638, 285);
        pCat2.addPoint(632, 278);
        pCat2.addPoint(630, 269);
        pCat2.addPoint(642, 264);
        pCat2.addPoint(643, 256);
        pCat2.addPoint(655, 250);
        pCat2.addPoint(659, 234);
        g.drawPolygon(pCat2);

        //g.drawLine();
    }
}
