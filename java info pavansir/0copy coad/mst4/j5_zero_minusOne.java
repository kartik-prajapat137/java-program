package mst4;

public class j5_zero_minusOne {
    public static void main(String[] args) {
        int[] arr = {1,23,-1,4,9,7,8,0};
        boolean one=false;
        boolean zero=false;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==-1){
            one=true;
           }
           if(arr[i]==0){
            zero=true;
           }
        }
        if(one&&zero){
            System.out.println("Zero(0) and (-1) is Present in the array: ");
        }else{
            System.out.println("Zero(0) and (-1) is NOT Present in the array: ");
        }
    }
}
