package Assingment2;
import java.util.Scanner;
public class ArithOperaSwitch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number1=");
        int num1=s.nextInt();
        System.out.println("Enter any arithmetic operator(+,-,*,/,%)=");
        char operator=s.next().charAt(0);
        System.out.println("Enter number2=");
        int num2=s.nextInt();
        int result;
        
        switch(operator){
            case '+' : result=num1+num2;
            System.out.println("Sum of two number="+result);
            break;
            case '-' : result=num1-num2;
            System.out.println("Subtraction of two number="+result);
            break;
            case '*' : result=num1*num2;
            System.out.println("Maltiplication of two number="+result);
            break;
            case '/' : result=num1/num2;
            System.out.println("Divition of two number="+result);
            break;
            case '%' : result=num1%num2;
            System.out.println("Remainder of two number="+result);
            break;
        }
    }
}
