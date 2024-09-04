import java.util.ArrayList;
import java.util.Collection;
public class j1_Alist {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add(101);
        l.add("akt");
        l.add("BAm");
        l.add("Alocated");
        l.add("printed");
        System.out.println(l);


        ArrayList l1 = new ArrayList<>();

        l1.add("Amit");
        l1.add("saithama");
        l1.add("ethachi");
        l1.add("jiraya");
        l1.add("Naruto");
        l1.add(78);
        System.out.println(l1);


        l.addAll(l1);
        System.out.println(l);

        System.out.println(l1.add("Naruto"));

        l.remove("saithama");
        System.out.println(l);
        l.removeAll (l1);
        System.out.println(l);

    }
}
