static class staticc {
    public void A() {
       System.out.println("Initializer Block executed....");
       System.out.println("Constructor Executed...");
    }
 
    public static void main(String[] var0) {
       new A();
    }
 
    static {
       System.out.println("Static Block Executed...");
    }
 }