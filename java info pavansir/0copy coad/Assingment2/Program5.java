package Assingment2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter frist people age=");
        int p1=s.nextInt();
        System.out.println("enter second people age=");
        int p2=s.nextInt();
        System.out.println("enter third people age=");
        int p3=s.nextInt();
        if(p1>p2 && p1>p3){
            System.out.println("frist people oldest and second and third  youngest");
        }
       else if(p2>p1 && p2>p3){
            System.out.println("second people oldest and frist and third youngest");
        }
        else if(p3>p1 && p3>p2){
            System.out.println("third people oldest and frist and second youngest");
        }

        
    }
}
