
import java.util.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class j2_ListInterface {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add(101);
        l.add("akt");
        l.add("BAm");
        l.add("Alocated");
        l.add("printed");
        System.out.println(l);

        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
    }

        Set s = new Set() {
            
        s.add(101);
        s.add("akt");
        s.add("BAm");
        s.add("Alocated");
        s.add("printed");
        System.out.println(s);
    }

        Iterator itr2 = s.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    

    }
}
