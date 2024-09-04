import java.util.TreeMap;
// import java.util.*;


public class j8_Treemap {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();

        tm.put(1,"hello1");
        tm.put(2,"hello2");
        tm.put(3,"hello3");
        tm.put(4,"hello4");
        tm.put(5,"hello5");
        System.out.println(tm);
        System.out.println(tm.ceillingKey());
        System.out.println(tm.ceillingKey());
    }
}
