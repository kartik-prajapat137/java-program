// print even no and divisible by 3 
// 18/01/24 

import java.util.Scanner;

public class j_2_print_even_or_divisible {
    public static void main(String[] args){
        try(Scanner sc = new Scanner (System.in)){
            
            int no = sc.nextInt();

            if(no%2 == 0 && no%3 == 0){
                System.out.println("Th eno is even & Divisible by 3");
                
            }
        }
    }

    
}
