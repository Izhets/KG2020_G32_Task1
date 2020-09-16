package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MainWindow extends JFrame {

    JPanel mainPanel = new JPanel();
    JTextField tField = new JTextField();

    public MainWindow() throws HeadlessException{
        //setContentPane(mainPanel);
        setBounds(300,300,300,300);
        tField.setPreferredSize(new Dimension(150,50));
        mainPanel.add(tField);
        mainPanel.addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseMoved(MouseEvent me){
                tField.setText("X="+me.getX()+" Y="+me.getY());
            }
        });

        DrawPanel dp = new DrawPanel();
        this.add(dp);
    }

}
