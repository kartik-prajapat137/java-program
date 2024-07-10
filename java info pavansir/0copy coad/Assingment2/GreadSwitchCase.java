package Assingment2;
import java.util.Scanner;
public class GreadSwitchCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter five Subject marks:");
        System.out.print("Enter marks of Physics:");
        int Physics=s.nextInt();
        System.out.print("Enter marks of Chemistry:");
        int Chemistry=s.nextInt();
        System.out.print("Enter marks of Biology:");
        int Biology=s.nextInt();
        System.out.print("Enter marks of Mathematic:");
        int Mathematic=s.nextInt();
        System.out.print("Enter marks of Computer:");
        int Computer=s.nextInt();
        int total=(Physics+Chemistry+Biology+Mathematic+Computer);
        int percentage=total/5;
        if(percentage>=90){
            System.out.println("your total number "+total+" parcentage "+percentage+" Grade A");
        }
        else if(percentage>=80){
            System.out.println("your total number "+total+" parcentage "+percentage+" Grade B");
        }
        else if(percentage>=70){
            System.out.println("your total number "+total+" parcentage "+percentage+" Grade C");
        }
        else if(percentage>=60){
            System.out.println("your total number "+total+" parcentage "+percentage+" Grade D");
        }
        else if(percentage>=40){
            System.out.println("your total number "+total+" parcentage "+percentage+" Grade E");
        }
        else{
            System.out.println("your total number "+total+" parcentage "+percentage+" Grade F");

        }

        
    }
}
