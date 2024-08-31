import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,plus,minus,multiple,divide,clear,equals;
    Calculator(){
        display =new TextField("0");
        display.setBounds(50,50,370,50);


        bt1 =new Button("1");
        bt1.setBounds(50,110,80,80);
        bt1.addActionListener(this);


        bt2 =new Button("2");
        bt2.setBounds(140,110,80,80);

        bt2.addActionListener(this);

        bt3 =new Button("3");
        bt3.setBounds(230,110,80,80);
        bt3.addActionListener(this);

        plus = new Button("+");
        plus.setBounds(320,110,80,80);
        plus.addActionListener(this);

        bt4 =new Button("4");
        bt4.setBounds(50,200,80,80);
        bt4.addActionListener(this);


        bt5 =new Button("5");
        bt5.setBounds(140,200,80,80);
        bt5.addActionListener(this);


        bt6 =new Button("6");
        bt6.setBounds(230,200,80,80);
        bt6.addActionListener(this);

        minus =new Button("-");
        minus.setBounds(320,200,80,80);
        minus.addActionListener(this);


        bt7 =new Button("7");
        bt7.setBounds(50,290,80,80);
        bt7.addActionListener(this);


        bt8 =new Button("8");
        bt8.setBounds(140,290,80,80);
        bt8.addActionListener(this);


        bt9 =new Button("9");
        bt9.setBounds(230,290,80,80);
        bt9.addActionListener(this);

        multiple =new Button("*");
        multiple.setBounds(320,290,80,80);
        multiple.addActionListener(this);

        bt0 =new Button("0");
        bt0.setBounds(50,380,80,80);
        bt0.addActionListener(this);


        clear =new Button("CLR");
        clear.setBounds(140,380,80,80);
        clear.addActionListener(this);


        equals=new Button("=");
        equals.setBounds(230,380,80,80);
        equals.addActionListener(this);

        divide =new Button("/");
        divide.setBounds(320,380,80,80);
        divide.addActionListener(this) ;

        add(bt0);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);

        add(plus);
        add(minus);
        add(multiple);
        add(divide);
        add(equals);
        add(clear);
        add(display);

        setSize(700,700);
        setLayout(null);
        setTitle("Calcutor");
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() ==  bt0){
            String expression = display.getText();
            expression += "0";
            display.setText(expression);
        }

        if(e.getSource() ==  bt1){
            String expression = display.getText();
            expression += "1";
            display.setText(expression);
        }

        if(e.getSource() ==  bt2){
            String expression = display.getText();
            expression += "2";
            display.setText(expression);
        }

        if(e.getSource() ==  bt3){
            String expression = display.getText();
            expression += "3";
            display.setText(expression);
        }

        if(e.getSource() ==  bt4){
            String expression = display.getText();
            expression += "4";
            display.setText(expression);
        }

        if(e.getSource() ==  bt5){
            String expression = display.getText();
            expression += "5";
            display.setText(expression);
        }

        if(e.getSource() ==  bt6){
            String expression = display.getText();
            expression += "6";
            display.setText(expression);
        }

        if(e.getSource() ==  bt7){
            String expression = display.getText();
            expression += "7";
            display.setText(expression);
        }

        if(e.getSource() ==  bt8){
            String expression = display.getText();
            expression += "8";
            display.setText(expression);
        }

        if(e.getSource() ==  bt9){
            String expression = display.getText();
            expression += "9";
            display.setText(expression);
        }

        if(e.getSource() ==  clear){
            display.setText("0");
        }

        if(e.getSource() ==  plus){
            String expression = display.getText();
            expression += "+";
            display.setText(expression);
        }

        if(e.getSource() ==  minus){
            String expression = display.getText();
            expression += "-";
            display.setText(expression);
        }

        if(e.getSource() ==  multiple){
            String expression = display.getText();
            expression += "*";
            display.setText(expression);
        }

        if(e.getSource() ==  divide){
            String expression = display.getText();
            expression += "/";
            display.setText(expression);
        }

        if(e.getSource() ==  equals){
            int a,b,i;
            char operator ='+';
            String expression= display.getText();
            String tempA="",tempB="";
            for(i=0;i<expression.length();i++){
                if(Character.isDigit(expression.charAt(i))){
                    tempA +=expression.charAt(i);
                }
                else{
                    operator = expression.charAt(i);
                    break;
                }
            }
            tempB = expression.substring(i+1);

            a=Integer.valueOf(tempA);
            b=Integer.valueOf(tempB);
            int result=0;

            switch (operator){
                case '+':
                    result = a+b;
                    break;
                case '-':
                    result =a-b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a /b;
                    break;
            }
            display.setText(String.valueOf(result));
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
