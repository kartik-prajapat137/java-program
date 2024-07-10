// 5) Create an Object having two properties and four behaviours
// (add,substract,multiply,divide) to perform desired operation.
// object must have setter and getter and keep all properties private.
class Test{
    private int a;
    private int b;
    Test(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int add(){
        return a+b;
    }
    public int substract(){
        return a-b;
    }
    public int multiply(){
        return a*b;
    }
    public int divide(){
        return a/b;
    }
}
public class j5_Setr_Getr {
    public static void main(String[] args) {
        Test test = new Test(8, 4);
        System.out.println("Add : "+test.add());
        System.out.println("Substraction : "+test.substract());
        System.out.println("Multiply : "+test.multiply());
        System.out.println("Divide : "+test.divide());
    }
}
