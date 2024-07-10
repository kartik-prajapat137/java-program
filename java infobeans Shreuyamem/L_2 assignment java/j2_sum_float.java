import java.util.Scanner;

public class j2_sum_float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     System.out.print("Enter first subject Marks = ");
    float a = sc.nextFloat();
    System.out.print("Enter 2nd subject Marks = ");
    float b = sc.nextFloat();
    System.out.print("Enter 3rd subject Marks = ");
    float c = sc.nextFloat();

    float sum = a+b+c;
    System.out.println("Total Sum Of FLoat NUmbers os = "+sum);
    }
}
