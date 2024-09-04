package TestPreperation2;

import java.util.Scanner;

public class j1_AnagramSTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[2];
        System.out.println("Enter Two String Check Anagram :");
        for (int i=0; i<str.length; i++) {
            str[i]=sc.next();
        }

        if(str[0].length()!=str[1].length()){
            System.out.println("NOt anagram for length Different:");
        }else{
            boolean flag2=true;
            int k=0;
            for (int i=0; i<str[1].length(); i++) {
                boolean flag=false;
                for (int j=0; j<str[1].length()-k; j++) {
                    if(str[0].charAt(i)==str[1].charAt(j)){
                        {
                        char[] c = str[1].toCharArray();

                        char temp=str[1].charAt(j);
                        c[j]=c[str[1].length()-1-k];
                        c[str[1].length()-1-k]=temp;
                        
                        str[1]=new String(c);
                        }
                        k++;
                        flag=true;
                        break;                        
                    }
                }
                if(!flag){
                    flag2=false;
                    break;
                }
            }
            if(flag2){
                System.out.println("String are Anagram: ");
            }else{
                System.out.println("String are Not Anagram: ");

            }
        }
    }
}
