//2.Write a Java program to sum values of an array 
//3.Write a Java program to calculate the average value of array element .

package TestPreperation;

public class j2_3_Average {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,9,10,5,5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Average is :"+sum/(arr.length));
    }
}
