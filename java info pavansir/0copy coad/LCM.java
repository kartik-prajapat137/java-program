import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter any num  to find LCM = ");
    int n = sc.nextInt();
    int temp=1;
    if(n==1){
        System.out.println("LCM of Num is = 1");
    }else{    
    int i=2;
    System.out.println("h");
    while (n>0&&i>=2) {
        if(n%i==0){
          n/=i;
          temp*=i;  
          System.out.println();
        }else{
            i++;
        }
    }System.out.println("LCM of Num is = "+temp);
}}
}
