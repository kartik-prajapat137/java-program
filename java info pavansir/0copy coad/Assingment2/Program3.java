package Assingment2;

import java.util.Scanner;

public class Program3 {
    public static void main(String args[]){ 
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your salary=");
    int salary=s.nextInt();
    System.out.println("Enter your year of service=");
    int year=s.nextInt();
    float netbonus,tax=(8.33f/100);
    if(year>5){
      netbonus= salary*tax;
      System.out.println(netbonus);
    }

   
    }
}