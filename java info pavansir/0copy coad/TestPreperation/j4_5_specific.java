package TestPreperation;
//4.Write a Java program to test if an array contains a specific value .
//5.Write a Java program to find the index of an array element .
import java.util.Scanner;

public class j4_5_specific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no to check Specific Value: ");
        int user = sc.nextInt();

        int[] arr = {1,3,5,8,4,5,9};
        int i=0;
        for (i = 0; i < arr.length; i++) {
            if(user==arr[i]){
                System.out.println("prent in the idx of "+i);
                break;
            }
        }
        if(i==arr.length){
            System.out.println("not present in the array:");
        }
    }
}
