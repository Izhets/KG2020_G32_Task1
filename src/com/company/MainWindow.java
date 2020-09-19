package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MainWindow extends JFrame {

    JPanel mainPanel = new JPanel();
    JTextField tField = new JTextField();

    public MainWindow() throws HeadlessException {
        DrawPanel dp = new DrawPanel();
        this.add(dp);

        //setContentPane(mainPanel);
        //setBounds(300, 300, 300, 300);

        tField.setPreferredSize(new Dimension(150, 50));
        dp.add(tField);
        dp.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me) {
                tField.setText("X=" + me.getX() + " Y=" + me.getY());
            }
        });

    }

}
