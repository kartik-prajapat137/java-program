package mst3;

public class j5_strToint {
    public static void main(String[] args) {
        String str = "1234567890";
        char[] ch = str.toCharArray();

        int num=0;
        for (int i = 0; i < ch.length; i++) {
            num*=10;
            num=num+ch[i]-'0';
        }
        System.out.println(num);
        // int k=1;
        // System.out.println((int)'1'==k);
        // int n2=(char)'3'-'0';
        // System.out.println(n2);
    }
}
