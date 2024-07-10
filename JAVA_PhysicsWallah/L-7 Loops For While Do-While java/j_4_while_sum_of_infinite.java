// Sum of infinite no When you want to stoped Coad to click 0.
// 19/01/24 12:25 AM.

import java.util.Scanner;

public class j_4_while_sum_of_infinite { 
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Please Enter  First No. infinite times if want to Exite Enter \n1. = "); 
            int num = sc.nextInt();
            int no=0;
            int n=2;

            while(num!=0){
            
                System.out.print(n+". ");
                no = no+num;
                n++;
                 num = sc.nextInt();
                 

            }

            System.out.println("Total sum is = "+no);
        }

    }
}
