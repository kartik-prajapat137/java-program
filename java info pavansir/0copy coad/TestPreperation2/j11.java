package TestPreperation2;
// Q7. WAP to Split a String into a Number of Substrings in Java
public class j11 {
   
    public static void main(String[] args) {
        String str="kartik";
        String str2="";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                str2+=str.charAt(j);
                System.out.print(str2+" ");
            }
            str2="";
            System.out.println();
        }
    }
}
