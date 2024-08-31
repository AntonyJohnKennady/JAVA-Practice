import java.util.Stack;

public class StackinCollections {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
//        stk.add(1);
//        stk.add(2);
        System.out.println(stk);
        stk.pop();
//        stk.remove(0);
        System.out.println(stk.peek());
    }
}
