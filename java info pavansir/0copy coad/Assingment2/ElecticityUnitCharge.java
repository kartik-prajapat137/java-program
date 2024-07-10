package Assingment2;
import java.util.Scanner;
public class ElecticityUnitCharge {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your electricity unites : ");
        int units=s.nextInt();
        double result;
        if(units<=50){
            result=units*0.50;
            System.out.println("Total electricity bill is "+(result+(result*20/100)));
        }
        else if(units<=150){
            result=50*0.50+(units-50)*0.75;
            System.out.println("Total electricity bill is "+(result+(result*20/100)));
        }
        else if(units<=250){
            result=50*0.50+100*0.75+(units-150)*1.20;
            System.out.println("Total electricity bill is "+(result+(result*20/100)));
        }
        else {
            result=50*0.50+100*0.75+100*1.20+(units-250)*1.50;
            System.out.println("Total electricity bill is "+(result+(result*20/100)));
        }
        
    }
}
