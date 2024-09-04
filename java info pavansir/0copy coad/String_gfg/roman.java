package String_gfg;

import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num conv to Roman: ");
        int n = sc.nextInt();

        while(n>0){
        if(n<4){
            for (int i=0; i<n; i++) {
                System.out.print("I");
            }
            n=0;
        }else if(n<9){
            if(n<5){
            System.out.print("IV");
            n=0;
            }
            else{
                System.out.print("V");
                for (int i=5; i<n; i++) {
                    System.out.print("I");
                }
                n=0;
            }
        }else if(n<40){
            if(n<10){
            System.out.print("IX");
            n=0;
            }
            else{
                for (int i=0; i<n/10; i++) {
                      System.out.print("X");
                }
                n=n%10;
            }
        }else if(n<90){
            if(n<50){
                System.out.print("XL");
                n=n%10;
            }else{
                System.out.print("L");
                n=n%50;
            }
        }else if(n<400){
            if(n<100){
                System.out.print("XC");
                n=n%10;
            }else{
                for (int i=0; i<n/100; i++) {
                    System.out.print("C");
                }
                n=n%100;
            }
        }else if(n<900){
            if(n<500){
                System.out.print("CD");
                n=n%400;
            }else{
                System.out.print("D");
                n=n%500;
            }
        }else if(n<4000){
            if(n<1000){
                System.out.print("CM");
                n=n%900;
            }else{
                System.out.print("M");
                for (int i=1; i<n/1000; i++) {
                    System.out.print("M");
                }
                n=n%1000;
            }
        }
    }
    }
}
