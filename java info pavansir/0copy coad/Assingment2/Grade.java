package Assingment2;
import java.util.Scanner;
public class Grade {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your percantage=");
        int percantage=s.nextInt();
        if(percantage>90){
            System.out.println("A grade");
        }
        else if(percantage<=90 && percantage>80){
            System.out.println("B grade");
        }
        else if(percantage<=80&&percantage>=60){
            System.out.println("C grade");
        }
        else{
            System.out.println("D grade");
        }
    }
    
}
