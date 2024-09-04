public class exception1 {
    public static void main(String[] args) {
        int a=100;
        int b=0;
        try {
            int data=a/b;
        } catch(ArithmeticException e) {System.out.println(e);}
        System.out.println("Reset of the code...");
    }
}
