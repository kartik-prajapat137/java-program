// Do While Loop.
// 19/01/24  12: 10AM.
// Start no from you give to till 10 ;

import java.util.Scanner;

public class j_3_Do_While_loop {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter n No. = ");
            int num = sc.nextInt();

            do{
                System.out.println(num);
                num++;
            }while(num<=10);
        }
    }
    
}
