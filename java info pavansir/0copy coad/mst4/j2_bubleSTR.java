package mst4;

public class j2_bubleSTR {
    public static void main(String[] args) {
        String arr[] = {"apple","banana","dog","cat"};

        for (int i = 0; i < arr.length-1; i++) {
            int k=0;
            char ch = arr[i].charAt(k);
            for (int j = i+1; j < arr.length; j++) {
                char ch2 =arr[j].charAt(k);
                if(ch>ch2){
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
