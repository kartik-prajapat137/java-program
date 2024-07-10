package Assingment2;
import java.util.Scanner;
public class BikePrice {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your bike price=");
        int price=s.nextInt();
        int tax,tax2,tax3;
        if(price>100000){
            tax=(price*15/100);
            System.out.println("if bike price is more than 100000 so tax="+tax);
        }
        else if(price>=50000 && price<= 100000){
            tax2=(price*10/100);
            System.out.println("if bike price is 50000 to 100000 so tax="+tax2);
        }
        else{
            tax3=(price*5/100);
            System.out.println("if bike price more than 100000 so tax="+tax3);
        }
    }
}
