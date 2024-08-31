import java.util.HashSet;
import java.util.Iterator;

public class HashSetinCollections {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(hs);
        hs.remove(1);
        System.out.println(hs);
    }
}
