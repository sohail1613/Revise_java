package com.company.clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalTime;

public class DigitalClock extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("New Times Roman", Font.BOLD, 40);

    public DigitalClock(){
        super.setTitle("Clock");
        super.setSize(500, 500);
        super.setLocation(300, 80);
        this.createGUI();
        startClock();
        setVisible(true);
    }

    public void createGUI(){
        heading = new JLabel("Clock");
        clockLabel = new JLabel("Clock");
        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);
    }

    public void startClock(){
        Timer timer = new Timer(1000, new ActionListener() {

            //after every second the action listener wil be call
            @Override
            public void actionPerformed(ActionEvent e) {
//                String dateTime = new Date().toLocaleString();
//                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
}
