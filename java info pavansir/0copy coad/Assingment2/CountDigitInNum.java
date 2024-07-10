// package Assingment2;
import java.util.Scanner;
public class CountDigitInNum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number=");
        int number =s.nextInt();
        System.out.println("Notes of 2000 ="+ number/2000);
        number=number%2000;
        System.out.println("Notes of  500 ="+ number/500);
        number=number%500;
        System.out.println("Notes of  200 ="+ number/200);
        number=number%200;
        System.out.println("Notes of  100 ="+ number/100);
        number=number%100;
        System.out.println("Notes of   50 ="+ number/50);
        number=number%50;
        System.out.println("Notes of   20 ="+ number/20);
        number=number%20;
        System.out.println("Notes of   10 ="+ number/10);
        number=number%10;
        System.out.println("Coines of   5 ="+ number/5);
        number=number%5;
        System.out.println("Coines of   2 ="+ number/2);
        number=number%2;
        System.out.println("Coines of   1 ="+ number/1);
        number=number%1;

        

    }
}
