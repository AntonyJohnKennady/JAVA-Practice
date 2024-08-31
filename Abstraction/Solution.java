import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of Rectangle..");
        double inputLength = scanner.nextDouble();
        double inputBreadth = scanner.nextDouble();

        System.out.println("Enter the dimensions of Square..");
        double inputSide = scanner.nextDouble();

        System.out.println("Enter the dimensions of Circle..");
        double inputRadius = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(inputLength, inputBreadth);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square(inputSide);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());


        Circle circle = new Circle(inputRadius);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}