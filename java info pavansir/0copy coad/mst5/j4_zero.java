package mst5;

public class j4_zero {
    public static void main(String[] args) {
        int[] arr={1,3,6,0,2,0,5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                for (int j = i; j>0; j--) {
                    arr[j]=arr[j-1];
                }
                arr[0]=0;
            }
            
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
