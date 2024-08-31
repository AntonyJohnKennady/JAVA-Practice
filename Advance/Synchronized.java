package Advance;

class Countercake{
    int cakeCount=0;
    public synchronized void increment(){
        cakeCount++;

    }
}
class Team implements Runnable{
    Countercake cakecounter;
    public Team(Countercake cakecounter) {
        this.cakecounter = cakecounter;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            cakecounter.increment();
        }
    }
}
public class Synchronized {
    public static void main(String[] args) {
        Countercake cakecounter=new Countercake();
        Thread team1=new Thread(new Team(cakecounter));
        Thread team2=new Thread(new Team(cakecounter));
        team1.start();
        team2.start();
        try{
            team1.join();
            team2.join();
        }catch (Exception E){

        }
        System.out.println(cakecounter.cakeCount);
    }
}
