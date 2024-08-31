import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class HashMapInCollections {
    public static void main(String[] args) {
        HashMap <Integer,String> hsh = new HashMap<>();
        hsh.put(1,"John");
        hsh.put(2,"Kennady");
        Iterator it = hsh.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(hsh);
        System.out.println(hsh.get(1));
        System.out.println(hsh.remove(2));
        System.out.println(hsh);


    }
}
