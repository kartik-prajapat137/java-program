package Assingment2;
import java.util.Scanner;
public class Greater2num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter two number for A and B:");
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>=b){
            System.out.println("A is greater B");
        }
        else{
            System.out.println("B is greater A");
        }
    }
}
