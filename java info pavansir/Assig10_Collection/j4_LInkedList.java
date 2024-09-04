import java.util.Iterator;
import java.util.LinkedList;

public class j4_LInkedList {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList<>();

        ls.addLast("km");
        ls.add("kart");
        ls.add("mert");
        ls.add("firt");
        ls.add("lirt");
        ls.addFirst("KTM");

        Iterator itr = ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
