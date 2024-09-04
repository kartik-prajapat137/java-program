import java.util.*;
import java.lang.*;
// 5) Write a java program to reverse each word of String.
//    Sample Input: “Java Is Plateform Independent”
//    Output: “avaJ sI mrofetalP tnednepednI”
class all{
     static void rev(String s1){
        String s3[] = s1.split(" ");
        for(String s2 : s3){
        for(int i=s2.length()-1; i>=0;i--){
           System.out.print(s2.charAt(i));
        }   
        System.out.print(" ");
    }
 }
}
public class j5_str_reverse {
    public static void main(String[] args) {
        String s1 = "java is a plateform independent";
        String s2 = "       ddjnk   jsdn ";
        String s3 = "       ddjnk   jsdn ";
        System.out.println(s3.trim());
        System.out.println(s2.trim());
        all.rev(s1);

    }
}
