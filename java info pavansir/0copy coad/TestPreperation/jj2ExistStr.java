package TestPreperation;

import java.util.Scanner;

// @2 wap to ask 5 names from user and check if particular name exists in array or not.
public class jj2ExistStr {
    public static void main(String[] args) {
        String[] str1 = {"kartik","ritik","prtik","abhishek"};
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("Enter six no: ");
        for (int i=0; i<str.length; i++) {
            str[i]=sc.next();
        }
System.out.println("Total exists :");
        for (int i=0; i<str.length; i++) {
            for (int j=0; j<str1.length; j++) {
                if(str[i].equals(str1[j])){
                    System.out.print(str[i]+" ");
                }
            }
        }


    }
}
