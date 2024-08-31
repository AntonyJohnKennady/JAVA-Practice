package Advance;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bounds {
    Bounds(){
        Frame frame = new Frame("Simple App");
        Label label = new Label("Email");
        label.setBounds(100,125,100,50);
        TextField emailInput = new TextField("Enter your email");
        emailInput.setBounds(250,140,180,30);

        Label label1 = new Label("Password");
        label1.setBounds(100,200,100,50);
        TextField passwordInput = new TextField("Enter your password");
        passwordInput.setBounds(250,215,180,30);

        Label label2 = new Label("Age");
        label2.setBounds(100,275,100,50);
        TextField ageInput = new TextField("Enter your Age");
        ageInput.setBounds(250,290,100,30);
        Button submit = new Button("Submit");
        submit.setBounds(220,350,50,20);
//        submit.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(emailInput.getText());
//                System.out.println(passwordInput.getText());
//                System.out.println(ageInput.getText());
//            }
//        });
//        ActionListener submitListener = new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(emailInput.getText());
//                System.out.println(passwordInput.getText());
//                System.out.println(ageInput.getText());
//            }
//        };
        ButtonListener submitListener = new ButtonListener(emailInput,passwordInput,ageInput);
        submit.addActionListener(submitListener);

        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(emailInput);
        frame.add(passwordInput);
        frame.add(ageInput);
        frame.add(submit);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }

    public static void main(String[] args) {
        new Bounds();
    }
}
class ButtonListener implements ActionListener{
    TextField emailInput;
    TextField passwordInput;
    TextField ageInput;

    public ButtonListener(TextField emailInput, TextField passwordInput, TextField ageInput) {
        this.emailInput = emailInput;
        this.passwordInput = passwordInput;
        this.ageInput = ageInput;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(emailInput.getText());
        System.out.println(passwordInput.getText());
        System.out.println(ageInput.getText());
    }
}
