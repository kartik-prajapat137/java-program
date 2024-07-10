// 16/01/24  11:40 PM ;

// SUM Of Two NumberS ;

import java.util.Scanner;

public class j_3_sum {
    public static void main(String[] args) {
      try  (Scanner sc = new Scanner(System.in)){

        System.out.print("Enter First NO. = ");
        int num_1 = sc.nextInt();

        System.out.print("Enter Second No. = ");
        int num_2 = sc.nextInt();

        int sum = num_1 + num_2;
        System.out.println("Total Sum is = " +sum);    
    }
    }
}
