class Addition{
    private int a;
    private int b;
    public Addition(int a, int b){
        this.a=a;
        this.b=b;
    }

    public  void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
    }
}
public class j1_1_getr_Setr {
    public static void main(String[] args) {
        Addition obj = new Addition(10, 20);
        obj.setA(30);
        System.out.println(obj.getA());
    }
}
