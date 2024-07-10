package Assingment2;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any alphabet=");
        char ch=s.next().charAt(0);
        if(ch<='z'&&ch>='a'||ch>='A'&&ch<='Z'){
            System.out.println( ch+" charachter is an alphabet" );
        }
        else{
            System.out.println( ch+" charachter is not an alphabet" );
        }
    }
}
