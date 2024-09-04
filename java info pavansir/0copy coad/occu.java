public class occu {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,11};
        int arr2[] = {-1,-1};
        int k=5;
        int temp=0;

        for (int i=0; i<arr.length; i++) {
             
            if(arr[i]==k){
                if(temp==0){
                 arr2[temp]=i;
                 temp++;
                }
                arr2[temp]=i;
                
            }
        }
        System.out.println(arr2[0]+" "+arr2[1]);
    }
}

