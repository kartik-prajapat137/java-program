class simpleArr{
    void arr_1(){
        int[] arr = {1,2,3,4,5,6,7};
        for(int i=0; i<7 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class j2Array {
    public static void main(String[] args) {
        simpleArr obj = new simpleArr();
        obj.arr_1();
    }
}
