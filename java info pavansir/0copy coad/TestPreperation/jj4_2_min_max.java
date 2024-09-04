package TestPreperation;
// @4 wap to print max and minimum value in given array

public class jj4_2_min_max {
    public static void main(String[] args) {
        
        int[] arr ={11,5,9,5,4,7,16,15};
        int max=arr[0];
        int min=arr[0];
        for (int i=0; i<arr.length; i++) {
           if(max<arr[i])
           max=arr[i];
           if(min>arr[i])
           min=arr[i];
        }
        System.out.println("Maximum and minimum");
        System.out.println(max+" "+min);
    }
}
