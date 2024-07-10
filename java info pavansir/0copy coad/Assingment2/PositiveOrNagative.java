package Assingment2;
import java.util.Scanner;
public class PositiveOrNagative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number=");
        int num=s.nextInt();
        if(num>0){
            System.out.println(num+" number is positive");
        }
        else if(num<0){
            System.out.println(num+" number is nagative");
        }
        else{
            System.out.println(num+" number is zero");
        }
    }
}
