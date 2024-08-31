//import java.util.Scanner;
//import java.math.*;
//class MyCalculator {
//    double n,p;
//    MyCalculator(int i) {
//        for (i = 1; i <= p; i++) {
//            if (i <= p) {
//                n *= p;
//            }
//        }
//    }
//
//    /*
//     * Create the method long power(int, int) here.
//     */
//
//    public long power(int n,int p){
//        this.n=n;
//        this.p=p;
//
//        if( n<0 || p<0 ){
//
//            throw new ArithmeticException("n and p should not be negative.");
//        }
//        else {
//            throw new ArithmeticException("n and p should not be zero.");
//        }
//        return power(n,p);
//        }
//
//
//
////  long MyCalculator(){
//
////      long result=(long) Math.pow(n, p);
////      return result;
////  }
//
//}
//public class John {
//    public static final MyCalculator my_calculator = new MyCalculator();
//    public static final Scanner in = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        while (in .hasNextInt()) {
//            int n = in .nextInt();
//            int p = in .nextInt();
//
//            try {
//                System.out.println(my_calculator.power(n, p));
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//}