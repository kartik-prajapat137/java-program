package TestPreperation;
// @4 wap to print max and minimum value in given array

public class jj4_min_max {
    public static void main(String[] args) {
        
        int[] arr ={11,5,9,5,4,7,16,15};
        int max1=arr[0];
        int max2=arr[arr.length-1];
        for (int i=0; i<arr.length; i++) {
            if(max1<arr[i]){
                int temp2=max1;
                max1=arr[i];
                if(max2>max1){
                    int temp=max1;
                        max1=max2;
                        max2=temp;
                }
                if(max2<temp2||max2==max1){
                    max2=temp2;
                }
            }
            if(max2<arr[i]&&arr[i]<max1){
                max2=arr[i];
            }
        }
        System.out.println("FIrst largest value and Second Largest Value");
        System.out.println(max1+" "+max2);
    }
}
