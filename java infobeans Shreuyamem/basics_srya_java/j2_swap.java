public class j2_swap {
    public static void main(String[] args) {
        int a=5,b=10,temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a=5 & b=10 After Swaping a="+a+" & b="+b);  

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("cap swap A="+a+" & B="+b);
    }
}
