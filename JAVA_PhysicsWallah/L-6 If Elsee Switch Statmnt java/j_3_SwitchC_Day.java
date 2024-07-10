// Switch case Use and Write 1 to 7 input From User And give Day;
// 18/01/24  11:10 PM ;

import java.util.Scanner;

public class j_3_SwitchC_Day {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Please Enter No. 1 to 7 For choesing Day =1");
            int Day = sc.nextInt();

            switch (Day) {
                case 1:
                    System.out.println("Monday");
                    break;
                    case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                    System.out.println("Wednesday");
                    break;
                    case 4:
                    System.out.println("Thusday");
                    break;
                    case 5:
                    System.out.println("Friday");
                    break;
                    case 6:
                    System.out.println("saturday");
                    break;
                    case 7:
                    System.out.println("Sunday");
                    break;
            
                default:
                    break;
            }
        }
    }
    
}
