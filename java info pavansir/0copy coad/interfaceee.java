interface A{
    int a=10;
}
 class interf implements A {
    // a=20;  
    void m1(){
        int a=20;
        System.out.println(A.a);
    }
     
}
class interfaceee implements A {
     public static void main(String[] args) {
        interf a = new interf();
        a.m1();
     }
}

