package TestPreperation2;
//Program 7: Write a program to input a word and check whether it is a palindrome word or not.
// Sample Input: madam Sample Output: madam (A word is said to be Palindrome, if the new
// word formed after reversing the letters is the same as the original word)

public class j10 {
    public static void main(String args[]){
        String str="madam";
        String str2="";

        for (int i=0; i<str.length(); i++) {
            str2+=str.charAt(str.length()-(i+1));
        }
        System.out.println(str2==str);
        if(str.equals(str2)){
            System.out.println("STR  is pelindropm: ");
        }else{
            System.out.println("STR are is't pelindropm: ");
        }
    } njmk
}
