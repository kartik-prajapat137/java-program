package Assingment2;
import java.util.Scanner;
public class Program8 {
    public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your couse=");
    char couse=s.next().charAt(0);
    char ch ='Y';
    if(couse == ch){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }

    }
}
