package TestPreperation2;
// Program 2: Write a program to accept a String in lower case and replace 'e' with in the given
// String. Display the new String.
// Sample Input:computer science
// Sample Output: comput*r sci*nc*

public class j6Str {
    public static void main(String[] args) {
        String str="computer science";
        String str2="";
        for (int i = 0; i<str.length(); i++) {

            if(str.charAt(i)=='e'){
                str2+='*';
            }else{
                str2+=str.charAt(i);
            }
        }
        System.out.println(str2);     
    }
}
