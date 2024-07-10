import java.util.Scanner;

class Star_loop{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any num to exchange = ");
        // int n = sc.nextInt();
        for (int i=1; i<=5; i++ ){ 
        for (int j=1; j<=i; j++){
            if (j==1||i==j||i==5){
        System.out.print ("*");
            }else {
                System.out.print(" ");
            }
        }System.out.println( );

}
}
}