package com.company.examples.clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Window extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("The New Times Roman", Font.BOLD, 45);
    public Window(){
        super.setTitle("Clock");
        super.setSize(400, 500);
        super.setLocation(950, 90);
        this.crateGUI();
        this.clockStart();
        super.setVisible(true);
    }

    public void crateGUI() {
        heading = new JLabel("Clock");
        clockLabel= new JLabel("First Clock");

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);
        
    }

    public void clockStart(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateTime = new Date(2022).toString();

                Date d = new Date(189);
                SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
                String dateTime = sdf.format(d);
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
}
