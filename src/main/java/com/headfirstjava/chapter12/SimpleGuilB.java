package com.headfirstjava.chapter12;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGuilB implements ActionListener {
    JButton button;

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGuilB gui = new SimpleGuilB();
        gui.go();
    }
}