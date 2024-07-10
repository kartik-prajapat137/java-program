// package Assingment2;
import java.util.Scanner;
public class WeekdayPrintSwitch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any digit between(1,2,3,4,5,6,7)=");
        int input_day_Number=s.nextInt();
        switch(input_day_Number){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wensday");
            break;
            case 4: System.out.println("Thuesday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Sturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default :System.out.println("Default number");
            break;
        }
    }
}
