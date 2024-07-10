import java.sql.Array;

class ArrayExample{

    void maxArr(){
        int arr[] = {1,2,3,4,6,2,9,4};
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max value of Array is = "+max+"\n");
    }

    void twoDArray(){
        int[][]  arr1 = new int[4][5];
        
        int[][] arr = { {1,2,3,4,5},{5,6,7,8,5},{9,10,11,12,5}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
            System.out.print(arr[i][j]+" ");
        }
    System.out.println(""); }


 System.out.println("");
    int[] arr2 = {1,2,3,4,5,6};
    for(int ar: arr2){
        System.out.print(ar+" ");
    } 
System.out.println("\n");
}

    void demoArray(){
        int[] age =  new int[3];
        float[] weight = new float[3];
        String[] names = {"kartik","arpan","mahendra"};
        for(String name : names){
            System.out.print(name+" ");
        }System.out.println("\n");
    }
}

public class j1_arrays {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.maxArr();
        obj.twoDArray();
        obj.demoArray();
        
    }
}
