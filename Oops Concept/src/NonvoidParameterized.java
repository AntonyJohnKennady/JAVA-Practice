public class NonvoidParameterized {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        int Result=add(10,20);
        Result=Result*5;
        System.out.println(Result);
    }
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
}
