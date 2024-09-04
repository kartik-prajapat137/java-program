package mst4;

public class j6_strReplace {
    public static void main(String[] args) {
        String str = "i am coder";
        String str2 = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str2=str2+"loader";
            }else{
                str2=str2+arr[i]+" ";
            }
        }
        System.out.println(str2);
    }
}
