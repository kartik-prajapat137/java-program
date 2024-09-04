/// Vector is legacy class
import java.util.Vector;
import java.util.*;
public class j5_Vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();

        v.add(101);
        v.add("akt");
        v.add("BAm");
        v.add("Alocated");
        v.add("printed");

        System.out.println(v.set(0, "ksk"));
        System.out.println(v.capacity());
        System.out.println(v.firstElement());
    }
}
