package mst3;

public class j1_majority {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,2,33,1,1,11,1,1,1,1,1};
        int n=arr.length/2;

        for(int i=0; i<arr.length; i++){
            int count=0;
            boolean flag=true;
            for (int k=0; k<i; k++) {
                if(arr[i]==arr[k]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                for (int j=i; j<arr.length; j++) {
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count>n){
                    System.out.println("Majority element: "+arr[i]);
                }
            }
        }
    }
}
