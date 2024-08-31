public class Recursion {
    public static void main(String[] args) {
        natNumbers(10);
    }
    public static void natNumbers(int n)
    {
        //Base case
        if(n==1){
            System.out.println(n);
        }
        //Recursive
        else {
            System.out.println(n);
            natNumbers(n-1);
        }
    }
}
