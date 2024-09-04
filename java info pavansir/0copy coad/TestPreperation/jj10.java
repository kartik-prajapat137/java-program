package TestPreperation;

import java.util.Scanner;

// @10. Take 20 integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of Os.
public class jj10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int pos=0,neg=0,zero=0,even=0,odd=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>0)
            pos++;
            if(arr[i]<0)
            neg++;
            if(arr[i]%2==0)
            even++;
            if(arr[i]%2!=0)
            odd++;
            if(arr[i]==0)
            zero++;
        }

        System.out.println("Zeros :"+zero);
        System.out.println("Positive :"+pos);
        System.out.println("Negative :"+neg);
        System.out.println("Even :"+even);
        System.out.println("Odd :"+odd);
    }
}
