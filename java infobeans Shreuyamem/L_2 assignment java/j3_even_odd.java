import java.util.Scanner;

class j3_even_odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number check even or odd = ");
        int n = sc.nextInt();

        if(n%2==0)
        System.out.println("Ginven Number is even = "+n);
        else
        System.out.println("Given Number id Odd = "+n);
    }
}