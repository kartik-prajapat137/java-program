// t1-sy+instance  t2-sy+instance  with one obj
// First             First
class Test{
    
    synchronized public void m1(){
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
    public First(Test test){
        this.test=test;
    }
    public void run(){
        test.m1();
    }
}
public class synch1 {
    public static void main(String args[]){
        Test test = new Test();
        First t1 = new First(test);
        First t2 = new First(test);

        t1.setName("t1 Proceccess..");
        t2.setName("t2 Proceccess..");

        t1.start();
        t2.start();
    }
}
