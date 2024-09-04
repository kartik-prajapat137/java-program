// Q3. Rotate an Array.(Write a program to rotate the elements of an array to the right by k positions.)

package TestPreperation2;
import java.util.Scanner;
public class j3_rotateArrk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  k no to rotate Arr: ");
        int k = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8};

        for (int i=0; i<k%arr.length; i++) {
            int temp=arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }arr[arr.length-1]=temp;
        }



        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
