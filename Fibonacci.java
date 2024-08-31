import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci series of "+n+" are ");
        for(int i=0;i<=n;i++){
            System.out.print(Fibo(i)+" ");
        }
    }
    public static int Fibo(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        else{
            return Fibo(n-1)+Fibo(n-2);
        }
    }
}
