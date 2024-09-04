public class check {
    public static void main(String[] args) {
        char ch='A';
        int k=0;
        for (int i = 1; i <=5; i++) {
            
            for (int j = 1; j <=5-i; j++) {
                if(i==1&&j==1){
                    System.out.print(ch++);
                }else{
                System.out.print("_");
                }
            }
            for (int j=1; j<=k; j++) {
                System.out.print(ch);
                ch++;
            }
            k=i+1;
            System.out.println();
        }
    }
}
