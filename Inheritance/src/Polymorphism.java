public class Polymorphism {
    public static void main(String[] args) {
        Ex obj=new Ex();
        obj.display();
        obj.display(6,5);
        obj.display();
    }
}
class Ex{
    void display(){
        System.out.println("Hi guys naan ungal Deva");
    }
    void display(int a,int b){
        if(a<b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    void display(int arr[]){
        System.out.println(arr);
    }
}
