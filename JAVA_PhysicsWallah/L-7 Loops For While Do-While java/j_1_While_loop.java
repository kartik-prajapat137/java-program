// While Loop;
// 18/01/24   11:45 PM ;
// counnting from 1 to as you want to and sum of Total Value ;

import java.util.Scanner;

public class j_1_While_loop {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter No.");
            int n = sc.nextInt();

            int sum = 0;
            int num =1;

            while (num<=n){
                System.out.println(num);

                sum=sum+num;
                num++;
                
            }
            System.out.println("Total Sum is = "+sum);
        }
    }
}
