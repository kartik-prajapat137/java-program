//For Loop ; table Of N no. ;
// 19/01/24  12:05 AM;

import java.util.Scanner;

public class j_2_For_loop { 
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter no N = ");
            int n = sc.nextInt();

            for(int i=1; i<=10; i++){
                System.out.print(i*n +" ");
            }

    }
  }    
}
