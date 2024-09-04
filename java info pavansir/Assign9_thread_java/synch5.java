//Class Level Locking.....
class Test {
    synchronized static void m1(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }  
      } public void m2(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }
}
class First extends Thread{
    Test test;
    First(Test test){
        this.test=test;
    }
    public void run(){
        test.m1();
    }
}class Second extends Thread{
    Test test;
    Second(Test test){
        this.test=test;
    }
    public void run(){
        test.m2();
    }
}
public class synch5 {
    public static void main(String[] args) {
        Test test = new Test();
        Test test2 = new Test();
        First t1 = new First(test);
        First t2 = new First(test2);
        // Second t2 = new Second(test2);

        t1.setName("Thread 1 Processing...");
        t2.setName("Thread 2 Processing...");

        t1.start();
        t2.start();
    
    }
}
