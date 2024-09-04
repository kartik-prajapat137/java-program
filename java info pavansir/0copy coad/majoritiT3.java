public class majoritiT3 {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3,2,3,2,2,4,2,3,2};

        for (int i = 0; i < arr.length; i++) {
            boolean flag=true;
            int count=0;
            for (int j = 0; j <i; j++) {
                if(arr[i]==arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                for (int j = 0; j < arr.length; j++) {
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count>(arr.length/2)){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
