public class TwoClasses {
    String name;
    int rollno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setName(String ajk,int num )
    {
        name=ajk;
        rollno=num;
    }

}
class Main{
    public static void main(String[] args) {
        TwoClasses me=new TwoClasses();
        me.setName("John",6369);
        me.display();


        TwoClasses aval=new TwoClasses();
        aval.setName("Aval",6379);
        aval.display();
    }
}
