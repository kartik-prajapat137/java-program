import java.util.Scanner;

class SumTwo{
     int add(int a, int b){
        int ans =a+b;
        return ans;
    }
}


public class j_1_method { //class
    public static void main(String[] args) {   // method
        SumTwo obj = new SumTwo();             // object
       try (Scanner sc = new Scanner(System.in)){
        // add two numbers with the help of add method 
        System.out.print("Enter First Number = ");
        int a = sc.nextInt(); 
        System.out.print("Enter Second Number = ");
        int b = sc.nextInt();
        
        int ans = obj.add(a, b);
        System.out.println("Sum of Two Numbers =" +ans);


// library clasess.
//1.> squar root.
        System.out.println("Squar Root (fix value in coad) = " +Math.sqrt(16));
//2.> less ythan point.
        System.out.println("Floor { fix vallue } =" +Math.floor(5.3));
//3.> greater than point n

        System.out.println("Ceil  { fix vallue } = " +Math.ceil(5.3));

        
    }
}
}
