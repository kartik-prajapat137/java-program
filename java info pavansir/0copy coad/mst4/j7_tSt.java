package mst4;

public class j7_tSt {
    public static void main(String[] args) {
        
        for (int i = 1; i<=10; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }for (int j = 1; j < (10-i)*2; j++) {
                System.out.print(" ");
            }for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
