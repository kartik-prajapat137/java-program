// Q5. Write a program to check if a given string contains only numeric digits
package TestPreperation2;

import java.util.Scanner;

public class j5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a str check contain  only numerics: ");
        // String str = "1";
        String str = sc.next();
        boolean flag=true;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i)<='0'||str.charAt(i)>='9'){
                flag=false;
                System.out.println("String is NOT contain only numeric:");
                break;
            }
        }if(flag){
            System.out.println("String is contain only numeric:");
        }

        
        String str2="^[0-9]";
        System.out.println(str2.matches(str));
        // for (int i = 0; i <=200; i++) {
        //     System.out.print((char)i+""+i+" ");
        // }
        // System.out.println("\n"+(char)12+"kj");
    }
}
