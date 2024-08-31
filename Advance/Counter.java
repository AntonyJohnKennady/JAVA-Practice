package Advance;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    TextField display;
    Button increment;
    Button reset;
    public Counter() {

        Frame frame = new Frame("Counter");
        display = new TextField("0");
        display.setBounds(100,100,300,50);
        increment = new Button("Increment");
        increment.setBounds(100,200,100,20);
        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(display.getText());
                display.setText(String.valueOf(++num));
            }
        });
        reset = new Button("Reset");
        reset.setBounds(300,200,100,20);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });
        frame.add(display);
        frame.add(increment);
        frame.add(reset);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }


    public static void main(String[] args) {
        new Counter();
    }
}
