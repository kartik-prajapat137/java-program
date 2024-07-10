package Assingment2;
import java.util.Scanner;
public class NumIsDivisible {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number=");
        int num=s.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("Number is divisible by 5 and 11 ");
        }
        else{
            System.out.println("Number is not divisible by 5 and 11 ");

        }
    }
}
