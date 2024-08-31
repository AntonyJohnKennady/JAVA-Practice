package Advance;
class Cakee implements Runnable{
    public void run(){
        System.out.println("Incredient Mixxing"+Thread.currentThread().getId());
        System.out.println("Baking"+Thread.currentThread().getId());
        System.out.println("Decorating"+Thread.currentThread().getId());
    }
}
public class MultiThreadingRunnable {
    public static void main(String[] args) {
        int cakeCount=5;
        for(int i=0;i<cakeCount;i++){
            Cakee cakee=new Cakee();
            Thread thread=new Thread(cakee);
            thread.start();
        }
    }
}
