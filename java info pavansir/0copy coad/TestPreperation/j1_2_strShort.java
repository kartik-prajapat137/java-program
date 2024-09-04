package TestPreperation;

public class j1_2_strShort {
    public static void main(String[] args) {
        String s ="Applee Bnnana mango Patato apple chappal";
        String s2[] = s.split(" ");
        System.out.println(s2.length);
        int length1=0;


        for (int i = 0; i < s2.length; i++) {
            length1=s2[i].length();
            s2[i]=s2[i].toUpperCase();
            for (int j=i+1; j < s2.length; j++) {
                s2[j]=s2[j].toUpperCase();
                if(s2[i].length()>s2[j].length()){
                    length1=s2[j].length();
                }
                for(int k=0; k<length1; k++){
                    if(s2[i].toLowerCase().charAt(k)>s2[j].toUpperCase().charAt(k)){
                        String temp =s2[i];
                               s2[i]=s2[j];
                               s2[j]=temp;
                               break;
                    }
                    if(s2[i].charAt(k)<s2[j].charAt(k)){
                        break;
                    }
                }
            }
        }

        for(String s1:s2){
            System.out.print(s1+" ");
        }
        
    }
}
