import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

class Bank{
   private int BankId;
   private double Amount;
    Bank(int BankId,double Amount){
        this.BankId=BankId;
        this.Amount=Amount;
    }
    public void Widrawal(double widraw) throws Exception{
        if(Amount-widraw<1000){
            throw new InsufficientResourcesException("INsuufficient Amount");
        }else{
            this.Amount=Amount-widraw;
            System.out.println(widraw+" widraw to yours Account");
            System.out.println("Current Bance is : "+Amount);
        }
        // return Amount;
    }
}

public class j1_Exeption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try { 
        System.out.println("Enter Amount for widraw : ");
        double widraw = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("invalisd input : ");
        }

        Bank b = new Bank(101,10000);

        try {
           b.Widrawal(widraw);
        } catch (Exception e){
            System.out.println(" you Do not have a insufficient Amount : "+e);
        }
    }
}
