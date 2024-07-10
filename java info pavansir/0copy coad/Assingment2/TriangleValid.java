package Assingment2;
import java.util.Scanner;
public class TriangleValid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three angles of the triangle=");
        int first_Angles=s.nextInt();
        int second_Angles=s.nextInt();
        int third_Angles=s.nextInt();
        int sum=(first_Angles+second_Angles+third_Angles);
        if(sum==180){
            System.out.println("Triangle is valid");
        }
        else{
            System.out.println("Triangle is not valid");

        }



    }
}
