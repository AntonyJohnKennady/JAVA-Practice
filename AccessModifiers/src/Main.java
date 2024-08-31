  class AccessModifier{
    //private String name;       //only access by this class
      protected String name;       //only access by this package
    int rollno;                     //default accessmodifier - only access by this package
    public void display()           //public accessmodifier - we can access anywhere
    {
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setName(String ajk,int num){
        name=ajk;
        rollno=num;
    }

      public String getName() {
          return name;
      }
  }

class Main {
    public static void main(String[] args) {
        AccessModifier me=new AccessModifier();
        me.setName("John",6369);
        me.display();

        AccessModifier aval=new AccessModifier();
        aval.setName("Aval",6379);
        aval.display();
        System.out.println(aval.getName());
    }
}