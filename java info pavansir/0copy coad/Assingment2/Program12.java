package Assingment2;
import java.util.Scanner;

public class Program12 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a four digit number=");
        int num=s.nextInt();
        int r,revers=0;
        while(num!=0){
            r=num%10;
            revers=revers*10+r;
            num=num/10;
        }
        System.out.println(revers);
    }
}
