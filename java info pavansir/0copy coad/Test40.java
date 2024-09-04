public class Test40 {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            for(int j=0; j<=2; j++){
                if(i==0||j==0||j==2||(i==2&&j==1))
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
