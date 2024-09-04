package TestPreperation;

import java.util.Scanner;

// 1 wap to define an array of integer of size 6.Take input from user and display it in reverse
// order
public class JJ1_Revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter six no: ");
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i=0,j=arr.length-1; i<j; i++,j--) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                System.out.println(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
