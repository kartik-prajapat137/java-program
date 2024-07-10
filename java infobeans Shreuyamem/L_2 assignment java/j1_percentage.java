import java.util.Scanner;

public class j1_percentage {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first subject Marks = ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd subject Marks = ");
    int b = sc.nextInt();
    System.out.print("Enter 3rd subject Marks = ");
    int c = sc.nextInt();
    System.out.print("Enter 4rth subject Marks = ");
    int d = sc.nextInt();
    System.out.print("Enter 5th subject Marks = ");
    int e = sc.nextInt();

    int percentage = ((a+b+c+d+e))/5;
    System.out.print("Percentage of Student is = "+percentage);
}
}