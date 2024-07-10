package Assingment2;
import java.util.Scanner;
public class OddEvenSwitch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number=");
        int num=s.nextInt();
        
        switch(num%2){
            case 0 : 
                System.out.println("number is even");
            break;
            case 1:
             System.out.println("number is odd");
            break;

        }
    }
}
