package Pratice;

import java.util.Scanner;

class Reverse{
    int number;

    public Reverse(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
public class ReverseOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number=scanner.nextInt();
        Reverse reverse = new Reverse(number);
        System.out.print("Reversed Number of "+number+" is : ");
        int Reversed=0;
        while (number !=0){
            int lastDigit = number % 10;
            Reversed = Reversed * 10 + lastDigit;
            number /= 10;
        }

        System.out.print(Reversed);

    }
}
