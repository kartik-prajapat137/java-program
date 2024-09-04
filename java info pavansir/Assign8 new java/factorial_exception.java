import java.util.Scanner;

public class factorial_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Fcatorial...");
        int factorial=1;

        try{
            int n = sc.nextInt();
            if (n<0) {
                System.out.println("Factorial only positive values...");
            } else {
                while (n>0){
                    factorial *=n;
                    n--;
                }System.out.println("Factorial is = "+factorial);
            }
        } catch(Exception e) {System.out.println(e);}
        
    }
}
