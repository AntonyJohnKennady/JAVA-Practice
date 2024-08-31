 class Constructor {        //Class name Method name both as same name is called constructor
    String name;
    int rollno;
    int mark;
//Default Constructor
//    Constructor(){
//        System.out.println("Default Constructor");
//    }

//     Parameterized Constructor
     Constructor(String ajk,int num,int score){
         name=ajk;
         rollno=num;
         mark=score;
     }
     void display(){
         System.out.println("Super Bro You are Completed till Constructor");
     }
     public static void main(String[] args) {
         Constructor obj=new Constructor("John",15,92);
         System.out.println(obj.name);
         System.out.println(obj.rollno);
         System.out.println(obj.mark);
         obj.display();
     }

}
