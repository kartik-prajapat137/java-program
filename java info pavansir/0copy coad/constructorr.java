class A{
    int c;
    A(int a, int...b){
        System.out.println(b);
    }
    public void m1(int f,int g,float... c){
        float c2=0;
        for(float cc :c){
        System.out.print(c2=(c2+cc));
        }
    }
}
public class constructorr {
    public static void main(String[] args) {
        A o = new A(7,7);
        o.m1(3,2,2,2,2,2,2,2,2,2);
    }
}
