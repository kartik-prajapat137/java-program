package mst3;

public class j4_permutation {
    public static void main(String[] args) {
        String s="ABC";
        char ch[] = s.toCharArray();
        var operator ="+";


        for(int i=0; i<s.length(); i++){
            int n=1;
            if(i%2!=0) n=2;
            for (int j = 0; j < ch.length; j++) {
                if(i!=j){
                String permutation="";
                permutation=permutation+ch[i]+ch[j]+ch[ j+n];
                n=-n;
                System.out.print(permutation+" ");
              }
            }
        }
    }
}  
