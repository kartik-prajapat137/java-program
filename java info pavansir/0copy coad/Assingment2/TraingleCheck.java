package Assingment2;
import java.util.Scanner;
public class TraingleCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the traingle three sides value=");
        int side1=s.nextInt();
        int side2=s.nextInt();
        int side3=s.nextInt();
        if(side1==side2 || side1==side3){
            System.out.println("This traingle is \"ISOSCELES TRIANGLE\"");
        }
        else if(side1==side2 && side1==side3 && side2==side3){
            System.out.println("This traingle is \"EQUILATERAL TRIANGLE\"");
        }
        else{
            System.out.println("This traingle is \"SCALENE TRIANGLE\"");

        }
    }
}
