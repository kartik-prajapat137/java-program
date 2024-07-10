package Assingment2;
import java.util.Scanner;
public class Program13 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number=");
        int num=s.nextInt();
        if(num==1){
            System.out.println("Test Data\n"+"Input number: "+num +"\nExpected output:  Monday");
        }
        else if(num==2){
            System.out.println("Test Data\n"+"Input number: "+num +"\nExpected output:  Tuesday");
        }
        else if(num==3){
            System.out.println("Test Data\n"+"Input number: "+num +"\nExpected output: Wednesday");
        }
        else if(num==4){
            System.out.println("Test Data\n"+"Input number: "+num +"\nExpected output: Thusday");
        }
        else if(num==5){
            System.out.println("Test Data\n"+"Input number: "+num +"\nExpected output: Friday");
        }
        else if(num==6){
            System.out.println("Test Data\n"+"Input number: "+num +"\nExpected output: Sturday");
        }
        else if(num==7){
            System.out.println("Test Data\n"+"Input number: "+num +"\nExpected output: Sunday");
        }
        else{
            System.out.println("Defult number");
        }

    }
}
