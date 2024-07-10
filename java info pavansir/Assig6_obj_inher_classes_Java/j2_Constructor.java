class Test{
    Test(){
        System.out.println(" Default : ");
    }Test(int x){
        System.out.println(" Singal int : "+x);
        
    }Test(int x , int y){
        System.out.println(" Double int : "+x+y);
        
    }Test(float x, float y){
        System.out.println(" Float : "+x+y);
        
    }Test(char a, char b){
        System.out.println(" Double char : "+a+b);
        
    }Test(byte a){
        System.out.println(" Singal Byte : "+a);
        
    }
}
public class j2_Constructor {
    public static void main(String[] args) {
        Test test1 = new Test(5);
        Test test2 = new Test( 5,10);
        Test test3 = new Test(5.5f,5.5f);
        Test test4 = new Test('a','b');
        Test test5 = new Test((byte)10);

    }
}
