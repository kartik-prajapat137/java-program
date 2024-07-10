class sample2{
   void program1(){
    String s1 ="90";
        String s2 ="90";
        System.out.println("1.op of s1+s2 is = " +s1+s2);
    }
    void  program2(){
        int a=10, b=20,c;
        c=a+b;
        System.out.println("2.output of a+b is = "+c);
    }
    void program3(){
        int a=10, b=20,c;
        c=a%b;
        System.out.println("3. op of a%b is = "+c);
    }
    void  program4(){
        int a=10,b=20;
        System.out.println("4. op of (a+b) is = "+(a+b));
    }
    void program5(){
        int a=10,c=++a;
        System.out.println("5. op of c(++a) is = "+c);
    }
    void program6(){
        int a=10,c=a++;
        System.out.println("6. op of c(a++) is = "+c);
    }
    void program7(){
        int a=20,b=10,c,d,e=10,f=4,g=9;
        a=a+1;
        b=b-1;
        e=e*2;
        f=f/2;
        System.out.println("7. op of a,b,e,f is = " +a+","+b+","+e+","+f);
    }
    void program23(){
        int a=10,b=5;
        System.out.println("23. op of a++ + b++ is = "+a++ + b++);
    }
    void   program24(){
        int c=5;
        System.out.println("24. op of compliment ~c is = "+~c);
    }
    void program25(){
        boolean e = false;
        System.out.println("25. op of boolean !e is = "+!e);
    }
}
public class j3_sample{
    public static void main(String[] args) {
       sample2 obj = new sample2();
       obj.program1();
       obj.program2();
       obj.program3();
       obj.program4();
       obj.program5();
       obj.program6();
       obj.program7();
       obj.program24();
       obj.program25();
    }
}