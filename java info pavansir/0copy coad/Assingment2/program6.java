package Assingment2;
import java.util.Scanner;
public class program6 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number=");
        int num=s.nextInt();
        int result;
        if(num<0){ 
            result =num*(-1);
            System.out.println(result); 
        }
        else if(num>0){
            System.out.println(num);
        }
        else{
            System.out.println("zero");
        }
}
}
