class Test {
    synchronized public void m1(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        System.out.println(" ");

        }catch(Exception e){
            e.printStackTrace();
        }
      }
      synchronized public void m2(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }
      public void m3(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }
      public void m7(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }
      synchronized static void m4(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }
      synchronized static void m5(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }
       static void m6(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }
      static void m8(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
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
class Thired extends Thread{
    Test test;
    Thired(Test test){
        this.test=test;
    }
    public void run(){
        test.m3();
    }
}
    class Fourth extends Thread{
        Test test;
        Fourth(Test test){
            this.test=test;
        }
        public void run(){
            test.m4();
        }
}
class Fifth extends Thread{
    Test test;
    Fifth(Test test){
        this.test=test;
    }
    public void run(){
        test.m5();
    }
}class Sixth extends Thread{
    Test test;
    Sixth(Test test){
        this.test=test;
    }
    public void run(){
        test.m6();
    }
}class Seventh extends Thread{
    Test test;
    Seventh(Test test){
        this.test=test;
    }
    public void run(){
        test.m7();
    }
}
class Eight extends Thread{
    Test test;
    Eight(Test test){
        this.test=test;
    }
    public void run(){
        test.m7();
    }
}
public class synch3 {
    public static void main(String[] args) {
        Test test = new Test();//main obj
        First t1 = new First(test);//sy+instance
        Second t2 = new Second(test);//sy+instance
        Thired t3 = new Thired(test);//instace
        Seventh t7 = new Seventh(test);//instace
        Fourth t4 = new Fourth(test);//sy + static
        Fifth t5 = new Fifth(test);//sy+static
        Sixth t6 = new Sixth(test);//static
        Eight t8 = new Eight(test);//static

        t1.setName("Thread 1 Processing...sy + instance");
        t2.setName("Thread 2 Processing...sy + instance");
        t3.setName("Thread 3 Processing... instance");
        t7.setName("Thread 7 Processing... instance");
        t4.setName("Thread 4 Processing...sy + static");
        t5.setName("Thread 5 Processing...sy + static");
        t6.setName("Thread 6 Processing... static");
        t8.setName("Thread 8 Processing... static");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

    }
}
