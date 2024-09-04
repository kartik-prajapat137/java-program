import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class j7_Hashmap {
    public static void main(String[] args) {
        
        HashMap hm = new HashMap<>();
                hm.put(1, "ramk1");
                hm.put(2, "ramk2");
                hm.put(3, "ramk3");
                hm.put(4, "ramk4");
                hm.put(5, "ramk5");
                System.out.println(hm);
                System.out.println(hm.remove(2));
                System.out.println(hm.containsKey(3));
                System.out.println(hm.containsValue("ramk5"));

                Set s = hm.entrySet();
                Iterator itr = s.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }
                
                
                System.out.println();

        
                Set s2 = hm.entrySet();
                Iterator itr2 = s2.iterator();
                while(itr2.hasNext()){
                    Map.Entry entry = (Map.Entry)itr2.next();
                    System.out.println(entry.getKey()+" == "+entry.getValue());
                    System.out.println(entry.getKey()+" == "+entry.getValue());
                }
    }
}
