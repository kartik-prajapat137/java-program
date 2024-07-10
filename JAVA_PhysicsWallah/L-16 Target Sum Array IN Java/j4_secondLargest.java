// Q. Find The Second Largest Element in The Array ;
import java.util.Scanner;

public class j4_secondLargest {
    
   static void secLargest(int[] arr){
        int mx = Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                idx=i;
            }
        }
        
        arr[idx]=0;  
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        System.out.println(mx);

        
    }
    
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array = ");
         int n = sc.nextInt();
         int[] arr = new int[n];

         System.out.print("Enter Array Elements = ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        secLargest(arr);
    }
}
