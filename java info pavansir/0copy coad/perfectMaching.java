class A{
    public void m1(long a, int b){
        System.out.println("float"+a+b);
    }
   public void m1(int a, float b){
        System.out.println("long"+a+b);
    }
}
public class perfectMaching {
    public static void main(String[] args) {
        A o = new A();
        o.m1(5, 5);
    }
}
