import java.util.Scanner;
class test2{
   public test2(){
        System.out.println("voter is not aligible for vote...");
    }
}
class test extends test2{
    public static void voter(int n){
        if(n<18){
            throw new test2();
        }else{
            System.out.println("Voter is Aligible for vote...");
        }
    }
}
public class throw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age for vote");
        int n = sc.nextInt();
        test v = new test();
        v.voter(n);
    }
}