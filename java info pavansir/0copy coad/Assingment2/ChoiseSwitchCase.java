package Assingment2;
import java.util.Scanner;
public class ChoiseSwitchCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two number=");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int result;
        System.out.println("Enter your choice('+','>','=')");
        char ch=s.next().charAt(0);
        switch(ch){
            case '+':result=num1+num2;
            System.out.println("addition of two number="+result);
            break;
            case '>':if(num1>num2){
                System.out.println("greater number "+num1);
            }
            else{
                System.out.println("greater number "+num2);
            } 
            break;
            case '=':if(num1==num2){
                System.out.println("Both number is equal");
            }
            else{
                System.out.println("Both number is not equal");
            }
        }
    }
}
