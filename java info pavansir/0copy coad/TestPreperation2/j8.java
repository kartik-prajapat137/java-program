package TestPreperation2;
// Program 5: Write a program to accept a string and change the case of each letter of the
// string.Display the new string. Sample Input: WelComE TO School Sample Output:wELcOMe to
// sCHOOL

public class j8 {
    public static void main(String args[]){
        String str=" WelComE TO School Sample;";
        String str2="";
        System.out.println((int)'"');
        for (int i=0; i<str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                str2+=Character.toLowerCase(str.charAt(i));
            }else{
                str2+=Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(str);
        System.out.println(str2);
    }
}

