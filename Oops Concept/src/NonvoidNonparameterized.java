public class NonvoidNonparameterized {
    public static void main(String[] args) {
        System.out.println(add());
        int Result=add();
        Result=Result*5;
        System.out.println(Result);
    }
    public static int add(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
}
