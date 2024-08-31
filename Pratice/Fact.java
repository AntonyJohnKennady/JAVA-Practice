package Pratice;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" are : ");
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.print(fact+" ");
        }
    }
}
