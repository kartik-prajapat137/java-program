// t1-sy+instance  t2-sy+instance  with one obj
//    First           Second
class Test {
    synchronized public void m1(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }synchronized public void m2(){
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
public class synch2 {
    public static void main(String[] args) {
        Test test = new Test();
        First t1 = new First(test);
        Second t2 = new Second(test);

        t1.setName("Thread 1 Processing...");
        t2.setName("Thread 2 Processing...");

        t1.start();
        t2.start();
    
    }
}
