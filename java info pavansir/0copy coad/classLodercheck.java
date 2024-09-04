class A{
    static int a;
    static int b =20;
    public static void meth(){
        System.out.println("method in A Class : is :"+(b+a)+" "+20+10);
    }
}
public class classLodercheck {
    public static void main(String[] args) {
        System.out.println("block2 main ");
        // A obj = new A();
        // obj.meth();
        A.meth();

    }
}
