package mst1;

public class abc9 {
    public static void main(String[] args) {
        byte[] a = {65,66,67,68,69,70};
        byte[] b = {71,72,73,74,75,76};
        System.arraycopy(a, 1, b, 3, 0);
        System.out.println(new String(a)+" "+new String(b));
    }
}
