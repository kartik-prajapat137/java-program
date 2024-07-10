package Assingment2;
import java.util.Scanner;
public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any value=");
        int value=s.nextInt();
        System.out.println("do you want to change 'C' or 'F'=");
        char ch=s.next().charAt(0);
        float celsius,fahrenhite;
        if(ch=='c'||ch=='C'){
            celsius=(value-32)*5/9;
            System.out.println(celsius+"Celsius");
        }
        else if(ch=='f'||ch=='F'){
            fahrenhite=(9/5)*value+32;
            System.out.println(fahrenhite+"Fahrenhite");
        }
        else{
            System.out.println("Default character");
        }
       

    }
}
