import java.util.Stack;

public class j6_Stack {
    public static void main(String[] args) {

        Stack st = new Stack<>();

        st.push("krt1");
        st.push("krt2");
        st.push("krt3");
        st.push("krt4");
        st.push("krt5");
        // st.add("kallu");
        // st.remove(3);

        System.out.println(st.search("krt1"));
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.empty());
        System.out.println(st.peek());
        System.out.println(st.search("krt"));
    }
}
