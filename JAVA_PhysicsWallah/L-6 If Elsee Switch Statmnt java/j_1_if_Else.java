// If Else Staments in java ;
// 18/01/24  12:10 AM ;

import java.util.Scanner;

public class j_1_if_Else {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)){

        System.out.print("Enter Your Age = ");
        int age = sc.nextInt();

        if(age <= 12){
            System.out.println("chailed");
        }else if(age > 12 && age <= 18){
            System.out.println("teenager");
        }else{
            System.out.println("Adult");
        }

      }
    }
    
}



