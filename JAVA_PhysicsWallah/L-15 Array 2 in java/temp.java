import java.util.Scanner;
//// prefix sum;
public class temp {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
             System.out.print("Enter Value of n = ");
            int n = sc.nextInt();

            int[] arr =new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
             int[] ans =  new int[arr.length];
             ans[0] = arr[0];

             for(int i=1; i<arr.length; i++){
                ans[i] = arr[i]+ans[i-1];
             }
             for(int i=0; i<arr.length; i++){
             System.out.println(ans[i]);
             }
            }
    }
    
}
