class k2{
    static{
        System.out.println("A-block-static-1");
    }
    public void m1(){
        System.out.println("A-default");
    }
    static{
        System.out.println("A-block-static-2");
    }
}
class k1 extends k2{
    static{
        System.out.println("B-block-static-1");
    }
    public void m1(){
        System.out.println("B-default");
    } 
    static{
        System.out.println("B-block-static-2"); 
    }
}
public class check2 {
    static{
        System.out.println("S-block-static-1");
    }
    public static void main(String[] args) {
       System.out.println("S-Default");
        k1 obj = new k1();
        k2 obj2 = new k2();
        obj.m1();
        obj2.m1();

    }
    static{
        System.out.println("S-block-static-2");
    }
}
