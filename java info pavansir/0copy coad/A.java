public class A{
    public static void main(String[] args){
            // int[]  x = {120, 200, 016};
            // for(int i = 0; i < x.length; i++){
            //          System.out.print(x[i] +" ");
            // }                   

            for(int i=1; i<=5; i++){
                int k=2;
                for(int j=1; j<=(i*2)-1; j++){
                    if(j<=i){
                        System.out.print(j);
                    }else{
                        System.out.print(j-k);
                        k=k+2;
                    }
                }System.out.println();
            }
    }
}