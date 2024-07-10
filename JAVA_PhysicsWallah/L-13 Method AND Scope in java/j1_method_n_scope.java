class algebra{
    int a;
    int b;

   algebra(int x, int y){
     a = x;
     b= y;
     int l = a+b;
     System.out.println(l);
    }
 void add(int x, int y){
    int l= x+y;
    System.out.println(l);
 }
}

public class j1_method_n_scope {

    public static void main(String[] args){
        algebra obj = new algebra(5,7);

       obj.add(7,7);
    }
}
