package mst5;

public class j8 {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 ="Word";

        int n=(str.length())+(str2.length());
        // int n=5;
        for (int i = 0; i < n; i++) {
            int one=0;
            int two=0;
            boolean flag=true;

            for (int j=0; j<5; j++) {
                if(j<=i){
                    System.out.print(str.charAt(one));
                    one++;
                }else{
                    if(flag){
                        System.out.print(" ");
                        flag=false;
                    }
                    System.out.print(str2.charAt(two));
                    two++;
                }
            }System.out.println();
        }
    }
}
