// Q. Find The Unique No. in a Given Array Where All The Elements are being repeated twice with One VAlue Being Unique 

import java.util.Scanner;

public class j_3_unique_no {

    static int[] uniquevqlue(int[] arr){
        int n = arr.length;
        int ans =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        return arr;
    }

    static void uniqueAns(int[] arr){
        int[] ans = uniquevqlue(arr);

        for(int i=0; i<ans.length; i++){
            if(arr[i]>0){
                System.out.println("Unique value of Array is = "+ans[i]);
            }
        }
    
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

         uniqueAns(arr);
        
    }
}
