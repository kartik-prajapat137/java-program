package Assingment2;
import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Basic Salary=");
        int basic_Salary=s.nextInt();
        int grossSalary;
        if(basic_Salary<=10000){
            grossSalary=basic_Salary+((basic_Salary*20)/100)+((basic_Salary*80)/100);
            System.out.println("grossSalary = "+grossSalary);
        }
        else if(basic_Salary<=20000){
            grossSalary=basic_Salary+((basic_Salary*25)/100)+((basic_Salary*90)/100);
            System.out.println("grossSalary = "+grossSalary);
        }
        else{
            grossSalary=basic_Salary+((basic_Salary*30)/100)+((basic_Salary*95/100));
            System.out.println("grossSalary = "+grossSalary);
        }
    }
}
