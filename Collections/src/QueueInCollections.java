import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollections {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
