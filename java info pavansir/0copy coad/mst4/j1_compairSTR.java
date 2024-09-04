package mst4;

public class j1_compairSTR {
    public static void main(String[] args) {
        String[] str = {"java","python","html","cpp"};
        String[] str2 = {"rust","java","nodejs","javascript"};

        for (int i = 0; i < str2.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if(str[i].equals(str2[j])){
                    System.out.println(str[i]+" ");
                }
            }
        }
    }
}
