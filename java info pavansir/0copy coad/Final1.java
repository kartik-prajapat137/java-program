class Base {
     int a=10;
     private void show() {
        int a=20;
       System.out.println("Base::show() called");
    }
}
 
class Derived extends Base {
    private void show() {
       System.out.println("Derived::show() called");
    }
}
 
public class Final1 {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.show();
    }
}