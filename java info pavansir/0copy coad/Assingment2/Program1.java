package Assingment2;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter length of rectangle=");
        int length=s.nextInt();
        System.out.println("enter breadth of rectangle=");
        int breadth=s.nextInt();
        if(length==breadth){
            System.out.println("It is square");
        }
        else{
            System.out.println("It is not square");
        }

    } 
        
}
