import java.util.Scanner;
class test{
    public static void voter(int n){
        if(n<18){
            throw new NullPointerException("voter is not aligible for vote...");
        }else{
            System.out.println("Voter is Aligible for vote...");
        }
    }
}
public class throw_Excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age for vote");
        int n = sc.nextInt();
        test v = new test();
        v.voter(n);
    }
}
