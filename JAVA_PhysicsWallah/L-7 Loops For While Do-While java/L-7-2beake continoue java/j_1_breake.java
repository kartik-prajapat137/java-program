// Breake keyword when multiple of 5 & 7;
// 29/01/24  11:30 PM.

public class j_1_breake {
    public static void main(String[] args) {
        
        int n = 1;

        while(true){
            if(n%5==0 && n%7==0){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
