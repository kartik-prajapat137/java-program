package mst4;

public class j4_missing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9};
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=count){
                System.out.println(count);
                count++;
                --i;
            }else{
                count++;
            }
        }
    }
}
