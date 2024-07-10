public class j_2_23_to32 {
    public static void main(String[] args) {
        int n=147,m;
        m=n;
        m=m/10;
        int f=n%10; 
        n=n%10;
        n=n*100;
        m=m+n+f;

       System.out.println(m);
    }
}
