package Advance;

import java.awt.*;

class Buttonn extends Frame{
    Buttonn(){
        Button button1 = new Button("Click me");
        Button button2 = new Button("Click me");
        add(button1);
        add(button2);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(200,200);

    }
}
public class Buttan {
    public static void main(String[] args) {
        new  Buttonn();
    }
}
