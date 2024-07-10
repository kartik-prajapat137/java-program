import java.util.Arrays;
import java.util.Scanner;

public class j2_arr_copy {

    //3.>

    static int lastOccurance(int arr[], int x){
        int lastIdx =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastIdx=i;
            }
        }
        return lastIdx;
    }

    //2.>
    static int countvalue(int arr[], int x){

        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    //1.>
   static void PrintArray(int[] arr){
        for(int i=0; i<arr.length; i++){
        System.out.print(+arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter An Array Size = ");
            int n = sc.nextInt();
            int arr1[] = new int[n];
    
            System.out.print("Enter "+n+" Elements in Array = ");
            for(int i=0; i<arr1.length; i++){
                 arr1[i] = sc.nextInt();
            }
    
            PrintArray(arr1);
// copy arr.

           int arr_2[] = arr1.clone();
        //    int arr_2[] = Arrays.copyOf(arr1, n)
        //    int arr_2[] = Arrays.copyOfRange(arr1, 0, n) // range from to to;

            PrintArray(arr_2);

            arr_2[0]=0;
            arr_2[1]=0;
            arr_2[2]=0;

            System.out.println("\n After changing Array_2's some Values");
            PrintArray(arr_2);
            PrintArray(arr1);
// countvalue of X.

System.out.println("\n Total time of no. x is " +countvalue(arr1,3));

System.out.println("\n Last Occurance of Index is " +lastOccurance(arr1,3));

        }
    }
}
