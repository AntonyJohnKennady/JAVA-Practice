import java.util.LinkedList;

public class LinkedListinCollections {
    public static void main(String[] args) {
        LinkedList <Character> ll = new LinkedList<>();
        ll.add('a');
        ll.add('b');
        System.out.println(ll);
        ll.remove();
        System.out.println(ll.peek());
        System.out.println(ll);

    }
}
