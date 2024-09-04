package mst3;

import java.util.Scanner;

public class j3_Facinating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A no: ");

        int n = sc.nextInt();
        int n2=n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }

        n=n2;
        if(count>3||count<3||n>333){
            System.out.println("Fail: ");
        }else{
            int arr[] = new int[9];
            int temp=0;
            for (int i = 1; i<=3; i++) {
                n=n*i;

                for (int j = 1; j<=3; j++) {
                    arr[temp]=n%10;
                    // System.out.println(n%10);
                    n=n/10;
                    temp++;
                }
                n=n2;
            }

            boolean flag=true;
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                        flag=false;
                        System.out.println("Fail");
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(flag)
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
