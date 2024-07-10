public class Nested_tryC {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        String k = "jn";
        try {
           try{ 
            String s=null;
            s.length();
            int divide =a/b;
            System.out.println("hh");
           } catch(ArithmeticException e){
            System.out.println("worng divide "+e);
           }int l = a/b;

        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("worng divide2 "+e);
        }
    }
}
