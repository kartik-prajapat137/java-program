import java.util.Scanner;
public class j4_greater_eq_less {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter first input = ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd input = ");
    int b = sc.nextInt();
    System.out.print("Enter 3rd input = ");
    int c = sc.nextInt();

    if(a>b && a>c){
        System.out.println("A is greater = "+a);
        if(b>c){
            System.out.println("B is middel Number ="+b);
            System.out.println("C is less Number ="+c);
        }else{
            System.out.println("C is middel Number ="+c);
            System.out.println("B is less Number ="+b);
        }
    }else if(b>c && b>a){
        System.out.println("B is greater = "+b);
        if(a>c){
            System.out.println("C is middel Number ="+c);
            System.out.println("A is less Number ="+a);
        }else{
            System.out.println("A is middel Number ="+a);
            System.out.println("C is less Number ="+c);
        }
    }else{
        System.out.println("C is Greater Number = "+c);
        if(a>b){
            System.out.println("A is middel Number ="+a);
            System.out.println("B is less Number ="+b);
        }else{
            System.out.println("B is middel Number ="+b);
        System.out.println("A is less Number ="+a);
        }
    }
    }
}
