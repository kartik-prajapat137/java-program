package Assingment2;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class WordFormat {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1 to 5=");
        int num=s.nextInt();
        switch(num){
            case 1:System.out.println("One");
            break;
            case 2:System.out.println("Two");
            break;
            case 3:System.out.println("Three");
            break;
            case 4:System.out.println("Four");
            break;
            case 5:System.out.println("Five");
            break;
            default:System.out.println("Wrong Digit put");
            

        }
    }
}
