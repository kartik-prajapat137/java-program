import java.util.Scanner;

public class j1_arr_input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

        System.out.print("Enter An Array Size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter "+n+" Elements in Array = ");
        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
       }
    }
}
}