import java.util.Scanner;

public class j5_FirstRepeatingVa {

    static int FirstRepeatV(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
                }
                return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array = ");
         int n = sc.nextInt();
         int[] arr = new int[n];

         System.out.print("Enter Array Elements = ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    ;
    System.out.println("First Repeatyed value in The Array is = "+FirstRepeatV(arr));

    }
}

