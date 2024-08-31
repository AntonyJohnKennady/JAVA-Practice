public class SumofNnumbersusingRecursion {
    public static void main(String[] args) {

        System.out.println(Total(5));
    }
    public static int Total(int n){
        if(n>1){
            return n+Total(n-1);
        }
        else {
            return 1;
        }

    }
}
