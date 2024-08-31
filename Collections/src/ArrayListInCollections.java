import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListInCollections {
    public static void main(String[] args) {
//        ArrayList <String> arr = new ArrayList<>();
        LinkedList<String> arr = new LinkedList<>();
        arr.add("John");
        arr.add("Kennady");
        System.out.println(arr);
        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
