package Assingment2;
import java.util.Scanner;
public class LowestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter four numbers=");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();
        int num4=s.nextInt();
        if(num1<num2||num1<num3||num1<num4){
            System.out.println(num1+" is lowest number to num2,num3 and num4.");
        }
        else if(num2<num1||num2<num3||num2<num4){
            System.out.println(num2+" is lowest number to num1,num3 and num4.");
        }
        else if(num3<num2||num3<num2||num3<num4){
            System.out.println(num3+" is lowest number to num1,num2 and num4.");
        }
        else {
            System.out.println(num4+" is lowest number to num1,num2 and num3.");
        }
    }
 }

