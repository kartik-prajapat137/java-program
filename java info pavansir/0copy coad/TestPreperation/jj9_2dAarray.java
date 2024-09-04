package TestPreperation;

import java.util.Scanner;

// @9.Initialize and print all elements of a 2D array.
public class jj9_2dAarray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elemint in 2D Array: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
                   
        for (int i=0; i<3; i++) {
            for (int j=0; j<5; j++) {
                if(i==j)
                System.out.print(arr[i][j]);
                else
                System.out.print(" ");
            }System.out.println();
        }
    }
}
