import java.util.*;

public class Conditions {

public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        int x = sc.nextInt();    
            if(x * 2 <=20) {
                System.out.println("Even");
            } else {
                if( x * 2 <= 30){
                
                   System.out.println("Odd");
            } else {
                    System.out.println("None");
        
                 }
                }
    }
    }
}

//
//public class Conditions{
//    public static void main (String rgs[]){
//        Scanner sc = new Scanner (System.in);
//        int age = sc.nextInt();
//        
//        if(age>18){
//            System.out.println("Adult");
//        }else{
//            System.out.println("not Adult");
//        }//
//    }
//}