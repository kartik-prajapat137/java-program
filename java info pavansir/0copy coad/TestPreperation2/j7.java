package TestPreperation2;
// Program 4: write a program to a accept a string and display: i. The number of lower case
// characters ii. The number of uppercase character iii. The number of special case characters iv.
// The number of digits present in the string
// Sample Input: S.T.D code of New Delhi – 011
// Sample Output : The number of lower case characters =12 The number of lowerupper =5 The
// number of special case characters =7 The number of digits present in the string =3

public class j7 {
    public static void main(String[] args) {
        String str ="S.T.D code of New Delhi – 011";
        int lower=0,upper=0,special=0,digit=0;

        char c='–';
        System.out.println((int)'9');
        // System.out.println(Character.isLowerCase(c));
        System.out.println(str.charAt(0)>64&&str.charAt(0)<96);
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i)>64&&str.charAt(i)<91){
                upper++;
            }else if(str.charAt(i)>97&&str.charAt(i)<126){
                lower++;
            }else if(str.charAt(i)>=48&&str.charAt(i)<=57){
                digit++;
            }else{
                special++;
            }
        }
        System.out.println("Upper case: "+upper+"\nLowe casse: "+lower+"\nDigit: "+digit+"\nSpecial case: "+special);
    }
}
