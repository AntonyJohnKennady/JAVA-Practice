package Advance;

import java.awt.*;

public class Button1 {
    Button1(){
        Frame frame = new Frame("Simple App");
        Button button1 = new Button("Click me");
        Button button2 = new Button("Click me");
        Label label = new Label("Enter your name");
        TextField textField = new TextField("Enter your name");
        TextArea textArea = new TextArea(" Enter  your Description");
        Checkbox checkbox = new Checkbox("Gender");
        Choice choice = new Choice();
        choice.add("India");
        choice.add("USA");
        choice.add("America");
        choice.add("Sri Lankah");
        frame.add(button1);
        frame.add(button2);
        frame.add(label);
        frame.add(textField);
        frame.add(textArea);
        frame.add(checkbox);
        frame.add(choice);
        frame.setLayout( new FlowLayout());
        frame.setVisible(true);
        frame.setSize(200,200);
    }

    public static void main(String[] args) {
        new Button1();
    }

}
