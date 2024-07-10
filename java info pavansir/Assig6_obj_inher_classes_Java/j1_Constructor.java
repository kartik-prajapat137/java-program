// 4)How to update and retrive  the value of a particular property of an object from anothor
//  class(Let suppose the property is private) ?
class Privaate{
    private int a;
    private int b;
    public Privaate(int a, int b){  // we can make Constructor as a public 
        this.a=a;
        this.b=b;
        System.out.println(" Constructor Set Private Value is : "+(a+b));
    }
    void set(int a, int b){
        a=a;
        b=b;
        System.out.println(" Method set private value : "+a+b);
    }

    static{
        System.out.println(": out of constructor");
    }

    void add(){
        System.out.println(" Basic Add method : "+a+b);
    }
}
public class j1_Constructor {
    public static void main(String[] args) {
        Privaate prvt = new Privaate(5,10);
        prvt.add();
        prvt.set(10, 20);

    }
}
