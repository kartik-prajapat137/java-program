package Assingment2;
import java.util.Scanner;
public class Program11 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age=");
        int age=s.nextInt();
        System.out.println("Enter your sex=");
        int sex=s.next().charAt(0);
        System.out.println("Enter your marital status=");
        int marital_Status=s.next().charAt(0);
        if(sex=='F'||sex=='f'){
            System.out.println("work only in urban areas");
        }
        else if(sex=='m'||sex=='M'){
            if(age>20&&age<40){
                System.out.println("work in anywhere");
            }
            else if(age>40&&age<60){
                System.out.println("work  in urban areas");
            }
            else{
                System.out.println("ERROR");
            }
        }
        else{
            System.out.println("ERROR");
        }

    }
}
