// package String_gfg;

public class j1_revers {
   public static void main(String[] args) {
    
        // code here
        String S="i.like.this.program.very.much";
        String s2[]=S.split("\\."); 

        for(int i=0,j=s2.length-1; i<=j; i++){
            String temp=s2[i];
            s2[i]=s2[j];
            s2[j]=temp;
        }
        
        String s3="";
        for(int i=0; i<s2.length; i++){
            String c=".";
            if(i<s2.length-1){
            s3=s3+s2[i]+c;
            }else
            s3=s3+s2[i];
        }
        System.out.println(s3+" ");
       }
    } 

