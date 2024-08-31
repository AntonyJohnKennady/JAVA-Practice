package Advance;
class Cake extends Thread {
    public void run(){
        System.out.println("Incredient Mixxing."+Cake.currentThread().getId());
        System.out.println("Baking"+Cake.currentThread().getId());
        System.out.println("Decorating"+Cake.currentThread().getId());
    }
}
public class MultiThread {
    public static void main(String[] args) {
        int cakeCount=4;
        for(int i=0;i<cakeCount;i++){
            Cake cake=new Cake();
            cake.start();
        }
    }
}
