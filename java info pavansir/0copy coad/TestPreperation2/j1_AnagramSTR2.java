package TestPreperation2;

import java.util.Scanner;

public class j1_AnagramSTR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[2];
        System.out.println("Enter Two String Check Anagram :");

        for (int i=0; i<str.length; i++) {
            str[i]=sc.next();
        }

        boolean flag=true;
        for (int i=0; i<str[1].length(); i++) {
            flag=true;
            int k=0;
           char c= str[0].charAt(i);

           for (int j=0; j<i; j++) {
            if(c==str[0].charAt(j)){
                k++;
            }
           }
           int k2=0;
            for (int j=0; j<str[1].length(); j++) {
                if(str[1].charAt(j)==c){
                    k2++;
                }
            }
            if(k2<=k){
                flag=false;
                break;
            }      
        }if(flag){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");

        }
    }
}
