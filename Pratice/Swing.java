package Pratice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Swing extends JFrame {
    JLabel name,email,age;  
    JTextField Tname,Temail,Tage;
    JButton submit;

    Swing(){
        name = new JLabel("Name");
        name.setBounds(100,50,100,20);
        Tname =new JTextField("Enter your Name");
        email = new JLabel("Email");
        email.setBounds(100,100,100,20);
        Temail = new JTextField("Enter your Email");
        Temail.setBounds(200,100,100,20);
        Tname.setBounds(200,50,100,20);
         age = new JLabel("Age");
        age.setBounds(100,150,100,20);
         Tage = new JTextField("Enter your Age");
        Tage.setBounds(200,150,100,20);
        submit = new JButton("Submit");
        submit.setBounds(180,200,100,20);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = Tname.getText();
                String email = Temail.getText();
                String age = Tage.getText();
                System.out.println("Name :"+name+"\nEmail : "+email+"\nAge : "+age);
            }
        });

        add(name);
        add(email);
        add(age);
        add(Tname);
        add(Temail);
        add(Tage);
        add(submit);
        setTitle("Form");
        setLayout(null);
        setSize(500,500);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Swing();
    }
}
