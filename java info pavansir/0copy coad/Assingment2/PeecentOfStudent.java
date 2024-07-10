package Assingment2;
import java.util.Scanner;
public class PeecentOfStudent {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Five number of Student:");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        int num4=s.nextInt();
        int num5=s.nextInt();
        int parcentage;
        parcentage=(num1+num2+num3+num4+num5)/5;
        System.out.println("Percentage of student="+parcentage);
    }
}
