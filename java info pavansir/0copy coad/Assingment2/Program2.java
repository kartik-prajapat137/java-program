package Assingment2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter quantity of cast=");
        int quantity=s.nextInt();
        int pay=0;
        if(quantity>1000){
           pay= quantity-(quantity/10);
        }
        System.out.println("total cost for user="+pay);
    }
    }
    

