package Assingment2;
import java.util.Scanner;
public class Program7 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Number of classes held=");
        int held=s.nextInt();
        System.out.println("Number of classes attended=");
        int attended=s.nextInt();
        float percentage=(attended/held)*100;
        if(percentage>75){
            System.out.println("Number of classes attended="+attended);
            System.err.println("student is  allowed to sit in exam");
        }
        else{
            System.out.println("Number of classes attended="+attended);
            System.err.println("student is not allowed to sit in exam");
 
        }
    }
}
