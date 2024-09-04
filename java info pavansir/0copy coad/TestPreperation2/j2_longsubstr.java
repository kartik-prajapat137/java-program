package TestPreperation2;

import java.util.Scanner;

public class j2_longsubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str for long sub str: ");
        String str= sc.next();
        String str2="";
        String str3="";
        int k=0;

        for (int i = 0; i <str.length(); i++) {
            boolean flag=true;
            for (int j=0; j<i-k; j++) {
                if(str.charAt(i)==str2.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                str2=str2+str.charAt(i);
                if(str3.length()<str2.length()){
                    str3=str2;
                }
            }else{
                str2="";
                i=k;
                k++;
            }
        }System.out.println("long sub str: "+str3);
    }
}
