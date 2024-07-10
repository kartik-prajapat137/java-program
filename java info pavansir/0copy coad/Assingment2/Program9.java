package Assingment2;
import java.util.Scanner;
public class Program9 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a character=");
        char ch = s.next().charAt(0);
        if(ch>='A' && ch<='Z'){
          System.out.println("charater is upper case");
        }
        else if(ch>='a'&&ch<='z'){
            System.out.println("charater is lower case");
        }
        else{
            System.out.println("other symbol");
        }
    }
}
