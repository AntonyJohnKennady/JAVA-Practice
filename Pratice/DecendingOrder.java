package Pratice;

import java.util.Scanner;

class Decending{
    int number;

    public Decending(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
public class DecendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number= scanner.nextInt();
        Decending reverse = new Decending(number);
        System.out.println("Decending Order of "+number+" is : ");
        for(int i=0;i<= reverse.getNumber();i++){
            System.out.print("\t"+(reverse.getNumber()-i));
        }
    }
}

