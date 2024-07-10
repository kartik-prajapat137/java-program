// 15) Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
// two integers
// three float
// all elements of array
// one double and one integer

class Test{
    public int Multiply(int a,int b){
        return a*b;
    }
    public float Multiply(float a,float b,float c){
        return a*b*c;
    }
    public int Multiply(int a[]){
        int mul=a[0];
        for (int i=1; i < a.length; i++) {
            mul*=a[i];
        }
        return mul;
    }
    public double Multiply(double a,int b){
        return a*b;
    }
    

}
public class j15_MathOperation {
    public static void main(String[] args) {
        Test test = new Test();
        int a[] = {1,2,3,4,5};
        System.out.println(test.Multiply(5,10));
        System.out.println(test.Multiply(5f,10f,12.5f));
        System.out.println(test.Multiply(a));
        System.out.println(test.Multiply(5.5,5));

    }
}
