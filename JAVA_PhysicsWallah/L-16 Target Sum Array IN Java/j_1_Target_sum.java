// Q. Find The Toatal No. Of Pairs in The Array Whose Sum is Equal To The Given Value.

import java.util.Scanner;

public class j_1_Target_sum {

    static int sumpair(int[] arr, int target){
        int n = arr.length;
        int ans =0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println(arr[i] +" & "+arr[j]);
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // arr = 4,6,3,5,8,2.;
        System.out.print("Enter Array Elements = ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target Sum = ");
        int target = sc.nextInt();

        System.out.println("Total sum Of Pairs "+sumpair(arr, target));
    }
    
}
