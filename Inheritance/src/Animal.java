public class Animal {  //parent class
    int noLegs=4;

    public static void eat(){
        System.out.println("I am eating");
    }
    public  static void walk(){
        System.out.println("I am walking");
    }

}
class Cat extends Animal{       //child class
    Boolean canmeow=true;
}
class Call{
    public static void main(String[] args) {
        Cat obj= new Cat();
        System.out.println(obj.canmeow);
        System.out.println(obj.noLegs);
        obj.eat();
        obj.walk();

    }
}
