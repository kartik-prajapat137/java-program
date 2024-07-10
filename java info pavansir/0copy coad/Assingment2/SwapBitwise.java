package Assingment2;
import java.util.Scanner;
public class SwapBitwise {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two number for a and b:");
        int a=s.nextInt();
        int b=s.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
    }
}
