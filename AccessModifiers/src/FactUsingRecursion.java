public class FactUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));;
    }
    public static int factorial(int fact){
        if(fact>=1){
            return fact *factorial(fact-1);
        }
        else {
            return 1;
        }
    }
}
