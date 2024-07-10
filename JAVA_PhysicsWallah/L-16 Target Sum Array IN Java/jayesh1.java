import java.util.Scanner;

public class jayesh1 {
    public static void main(String argsString[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter i number of rows = ");
         int n = 10;
         int m = 10;

         for(int i=1;i<=n;i++){
            for(int k=i; k<=n; k++){
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n|j==m){
                    System.out.print("*");
                } else System.out.print(" ");
               
            } System.out.println(" ");
            
         }
}
} 