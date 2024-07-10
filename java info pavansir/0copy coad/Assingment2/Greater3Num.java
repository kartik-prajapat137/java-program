package Assingment2;
import java.util.Scanner;
public class Greater3Num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three number for A,B and C:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b&&a>c){
            System.out.println("A is greater then B and C");
        }
        else if(b>a&&b>c){
            System.out.println("B is greater then A and C");
        }
        else{
            System.out.println("C is greater then A and B");
        }
        

    }
}
