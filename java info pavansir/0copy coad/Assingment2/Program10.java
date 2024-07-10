package Assingment2;
import java.util.Scanner;
public class Program10 {
  public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter any year=");
      int year=s.nextInt();
      if(year%400==0||year%4==0){
        System.out.println("this year is leap year");
      }
      else{
        System.out.println("this year is not leap year");
      }
  }  
}
