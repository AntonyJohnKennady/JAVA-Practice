package Advance;
class Cakeee extends Thread {
    public void run(){
        try {
            System.out.println("Incredient Mixxing." + Cake.currentThread().getName());
            System.out.println("Baking" + Cake.currentThread().getName());
            System.out.println("Decorating" + Cake.currentThread().getName());
        }catch (Exception e){
            System.out.println("Exception is Caught");
        }
    }
}
public class Sleep {
    public static void main(String[] args) {
        int cakeCount=4;
        for(int i=0;i<cakeCount;i++){
            Cakeee cake=new Cakeee();
            cake.start();
            cake.setPriority(Thread.MAX_PRIORITY);
//            System.out.println(cake.getPriority());
            cake.setName("Venela "+i);

//            try{
//                if(i==1){
//
//                    cake.sleep(2000);
//                }
//            }catch (Exception e){
//
//            }
        }
        Cakeee sample = new Cakeee();
        sample.start();
        System.out.println(sample.isAlive());
        try{
            sample.join();
        }catch (InterruptedException e){

        }
        System.out.println(sample.isAlive());

    }
}

