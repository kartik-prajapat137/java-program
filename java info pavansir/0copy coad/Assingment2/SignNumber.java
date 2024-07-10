package Assingment2;
import java.util.Scanner;
public class SignNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any positive ,nagative and zero number=");
        int num=s.nextInt();
        if(num>0){
            System.out.println(num+" Number sign is positive");
        }
         else if(num<0){
            System.out.println(num+" Number sign is nagative");
        }
        else{
            System.out.println(num+" number is zero");
        }
    }
}
