package Assingment2;
import java.util.Scanner;
public class VowelSwitchCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any character=");
        char ch=s.next().charAt(0);
        switch(ch){
            case 'a':System.out.println(ch+" is vowel");
            break;
            case 'e':System.out.println(ch+" is vowel");
            break;
            case 'i':System.out.println(ch+" is vowel");
            break;
            case 'o':System.out.println(ch+" is vowel");
            break;
            case 'u':System.out.println(ch+" is vowel");
            break;
            default:System.out.println(ch+" is not vowel");
            break;
        }
    }
}
