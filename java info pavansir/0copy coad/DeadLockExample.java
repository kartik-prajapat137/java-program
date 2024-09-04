class Test1 {
    Test2 test2;
    
    synchronized public void p1() {
        try {
            System.out.println(Thread.currentThread().getName() + " acquired lock on Test1");
            Thread.sleep(100); // simulate some work
            test2.p2(); // trying to acquire lock on Test2
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }
}

class Test2 {
    Test1 test1;
    
    synchronized public void p2() {
        try {
            System.out.println(Thread.currentThread().getName() + " acquired lock on Test2");
            Thread.sleep(100); // simulate some work
            test1.p1(); // trying to acquire lock on Test1
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setTest1(Test1 test1) {
        this.test1 = test1;
    }
}

class First extends Thread {
    Test1 test1;
    Test2 test2;
    
    public First(Test1 test1, Test2 test2) {
        this.test1 = test1;
        this.test2 = test2;
    }
    
    public void run() {
        test1.p1();
    }
}

class Second extends Thread {
    Test2 test2;
    Test1 test1;
    
    public Second(Test2 test2, Test1 test1) {
        this.test2 = test2;
        this.test1 = test1;
    }
    
    public void run() {
        test2.p2();
    }
}

public class DeadLockExample {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        
        test1.setTest2(test2);
        test2.setTest1(test1);
        
        First t1 = new First(test1, test2);
        Second t2 = new Second(test2, test1);

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}
