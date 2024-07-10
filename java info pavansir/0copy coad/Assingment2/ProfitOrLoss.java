package Assingment2;
import java.util.Scanner;
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter parchesce price of item=");
        int parchesce_Price_Of_Item=s.nextInt();
        System.out.println("Enter seling price of item=");
        int seling_Price_Of_Item=s.nextInt();

        if(seling_Price_Of_Item>parchesce_Price_Of_Item){
            System.out.println("profit");
        }
        else{
            System.out.println("loss");
        }
    }
}
