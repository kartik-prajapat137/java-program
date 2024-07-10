@FunctionalInterface
interface Test {
     void Lambda(String str);
}
public class LambdaMethod {
    public static void main(String[] args){
        Test lmd = str ->System.out.println(str.toUpperCase());

        lmd.Lambda("hello");
    }
}

