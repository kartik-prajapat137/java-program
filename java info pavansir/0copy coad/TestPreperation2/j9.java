package TestPreperation2;
// Program 6: Write a
// program in Java to accept a name(Containing three words) and Display only the initials (i.e., first
// letter of each word). Sample Input: LAL KRISHNA ADVANI Sample Output: L K A

public class j9 {
    public static void main(String[] args) {
        String str="LAL KRISHNA ADVANI ";

        String[] str2=str.split(" ");
        String str3="";

        for (int i=0; i<str2.length; i++) {
            str3+=str2[i].charAt(0);
        }
        System.out.println(str3);
    }
}
