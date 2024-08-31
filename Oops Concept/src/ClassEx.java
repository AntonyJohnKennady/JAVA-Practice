public class ClassEx {              //class is a collection of feilds and methods
    String name;                    //variables are the feilds
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);

    }
    public static void main(String args[])
    {
        ClassEx obj=new ClassEx();      //ClassEx-Classname,obj-objectname,new-allocate memory,ClassEx-constructor
        obj.name="John";
        obj.rollno=15;
        obj.display();
    }
}
