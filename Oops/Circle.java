package Oops;

import java.sql.SQLOutput;

class Circlee{
    private double radius;

    public Circlee(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double areaOfCircle(){
        return Math.PI * radius * radius;
    }
    public double circumferenceOfCircle(){
        return 2 * Math.PI * radius;
    }
}
public class Circle {
    public static void main(String[] args) {
        Circlee circle1=new Circlee(4.5);
        Circlee circle2=new Circlee(5);
        System.out.println("Area of Circle1 is : "+String.format("%.2f",circle1.areaOfCircle()));
        System.out.println("Circumference of Circle1 is : "+String.format("%.2f",circle1.circumferenceOfCircle()));
        System.out.println("Area of Circle2 is : "+String.format("%.2f",circle2.areaOfCircle()));
        System.out.println("Circumference of Circle2 is: "+String.format("%.2f",circle2.circumferenceOfCircle()));
    }
}
