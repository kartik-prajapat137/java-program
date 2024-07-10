interface laptop{
    private void keyword(){
        System.out.println("15 Keywords");
    }
    void size();
}
class show implements laptop{
    public void size(){
        System.out.println("10 mm");
    }
    // public void keyword(){
    //     System.out.println("Static");
    // }
}
public class intfa{
    public static void main(String[] args) {
        show obj = new show();
        obj.size();
    }
}
