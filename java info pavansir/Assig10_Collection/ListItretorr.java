import java.util.*;
import java.util.Collection;
 import java.util.ListIterator;
import java.util.ArrayList;

public class ListItretorr{
    public static void main(String[] args) {
        
        ArrayList l = new ArrayList<>();
        l.add(101);
        l.add("akt");
        l.add("BAm");
        l.add("Alocated");
        l.add("printed");
        System.out.println(l);

        ListIterator itr = l.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
    }
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
    }
    }
}