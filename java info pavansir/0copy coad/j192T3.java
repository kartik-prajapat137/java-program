import java.util.Scanner;

public class j192T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int n2=n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        n=n2;
        if(count>3 || n>333){
            System.out.println("no Facinating Number: ");
        }else{
            int[] arr = new int[9];
            int temp=0;
            for (int i=1; i<=3; i++) {
                n=n2*i;
                for (int j=1; j<=3; j++) {
                    arr[temp]=n%10;
                    n=n/10;
                    temp++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            boolean flag=true;
            for (int k=0; k<arr.length-1; k++) {
                for (int l=k+1; l<arr.length; l++) {
                    if(arr[k]==arr[l]){
                        System.out.println("fail:");
                        flag=false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
        }
    }
}
