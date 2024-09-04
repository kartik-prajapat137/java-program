package mst1;

public class StringCheckDup {
    public static void main(String[] args) {
        String str = "i am in the class class room or  in not in the class class class room";
        String[] str2 = str.split(" ");

        for(int i=0; i<str2.length; i++){
            for(int j=i+1; j<str2.length-1; j++){
            if(str2[i].equals(str2[j])){
                System.out.println(str2[i]);
                break;
            }
          }
        }

    }
}
