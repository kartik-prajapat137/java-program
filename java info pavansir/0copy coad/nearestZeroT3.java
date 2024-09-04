public class nearestZeroT3 {
    public static void main(String[] args) {
        int[] arr = {-2,5,3,-1,-6,7,-4};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j]==1){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
