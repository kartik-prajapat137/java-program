class Test1{
    Test2 test2;
    synchronized public void p1(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                // Thread.sleep(1000);
               this.test2.p2();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
     public void m1(Test2 test2){
        try{
            this.test2=test2;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Test2{
    Test1 test1;
    synchronized public void p2(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                test1.p1();
                // Thread.sleep(1000);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
     public void m2(Test1 test1){
        try{
           this.test1=test1;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class First extends Thread {
    Test1 test1;
    Test2 test2;
    public First(Test1 test1, Test2 test2){
        this.test1=test1;
        this.test2=test2;
    }
    public void run(){
        this.test1.m1(test2);
        test1.p1();
    }
}
class Second extends Thread {
    Test2 test2;
    Test1 test1;
    public Second(Test2 test2, Test1 test1){
        this.test2=test2;
        this.test1=test1;
    }
    public void run(){
        test2.m2(test1);
        test2.p2();
    }
}
public class DeadLock {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        First t1 = new First(test1,test2);
        Second t2 = new Second(test2,test1);

        t1.setName("Thread 1 Locked .....");
        t2.setName("Thread 2 Locked .....");

        t1.start();
        t2.start();
    }
}
