import java.util.Scanner;

class test43 {
    public static void vailidateAge(int age) throws Exception {
        if(age<18){
            System.out.println("Age statement");
        throw new IllegalArgumentException();
        }else{
            System.out.println("Age is Passed for Verification...");
        }
    }
    
}
class test2{

}
public class throwsss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test43 t = new test43();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        try {
            t.vailidateAge(age);
        } catch (Exception e) {
            System.out.println("Age is not Vailid For Verificatin");
        }
    }
}
