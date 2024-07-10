class Algebra{
    int a;
    int b;
    Algebra(int x, int y){
        System.out.println("constroctor is called");
    a = x;
    b = y;
    }

    int add(){
        return a+b;
    }

    int mull(){
        return a*b;
    }
    int sub(){
        return a-b;
    }
}


public class j2_constructor {
    public static void main(String[] args) {
        Algebra obj = new Algebra(7,5);

        System.out.println(obj.add());
        System.out.println(obj.mull());
        System.out.println(obj.sub());

        Algebra obj2 = new Algebra(5,7);

        System.out.println(obj2.add());
        System.out.println(obj2.mull());
        System.out.println(obj2.sub());
return;
    }
}
