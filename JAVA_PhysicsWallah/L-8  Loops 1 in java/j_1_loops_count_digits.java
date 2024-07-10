// 1.>Count Total Length of no's.
// 31/01/24 12:50 AM.
//2.> sum of Total Digits.
//3.> Revers Given no.

import java.util.Scanner;

public class j_1_loops_count_digits {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter any number give you length,revers,sum of no.  = ");
            int num = sc.nextInt();
            int count=0;
            int sum=0;
            int gum = 0;
            int bum=0;

            while (num!=0){

                gum = num%10;
                bum = bum*10+gum;
                sum = sum+gum;
                num = num/10;
                count++;
                
            }
            System.out.println("Total Length of Number is ="+count);
            System.out.println("Total sum of Number is ="+sum);
            System.out.println("Revers of numbers is = " +bum+"\n");

            System.out.print("Enter anth term of n is = ");

// //4.> anth gterm of 1-2+3-4+5**6.....n.

//             System.out.print("Enter n number for 1-2+3...n = ");
//             int n = sc.nextInt();
//             int pluse = 0;
//             int mynus = 0;

//             for(int i=1; i<=n; i++){
//                 if(i%2 != 0){
//                     pluse += i;
//                 }else{
//                     mynus -= i;
//                 }
//             }
//             int total = pluse+mynus;
//             System.out.println("Total of Plus = "+pluse);
//             System.out.println("Total of mynus = "+mynus);
//             System.out.println("Toata Anth terme 0f 1-2+3-4+5...n = "+total+"\n");



// // // 5.> factorial.

// System.out.print("Enet Factorial no. =");
// int fact = sc.nextInt();
// int sumfact=1; 

// for(int i=1; i<=fact; i++){
//     sumfact*=i;
// }
// System.out.println("Total Sum of Factorial ="+ sumfact+"\n");

// 6.> a to the power b.

// System.out.print("Enter A and B to get A to the power of b = ");
// int a = sc.nextInt();
// int b = sc.nextInt();

// int power=1;
// for(int i=1; i<=b; i++){
//      power*=a;
// }
// System.out.println("A to the power of B is = " +power);
        }
    }
}

