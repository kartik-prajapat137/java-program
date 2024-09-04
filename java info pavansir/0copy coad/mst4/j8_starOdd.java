package mst4;

public class j8_starOdd {
    public static void main(String[] args) {
        
        for (int i = 1; i < 7; i++) {
            int k=1;
            for (int j = 001; j < i*2; j++) {
                if(j%2==0){
                    System.out.print("*");
                }else{
                    System.out.print(k);
                    k=k+2;
                }
            }System.out.println();
        }
    }
}

