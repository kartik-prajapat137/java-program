package mst4;

public class j3_sum2ele {
    public static void main(String[] args) {
        int[] arr ={1,3,4,2,5,3,7,4,11};
        int val=6;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j=i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==val){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
