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
       public void m2(){
        try{
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);

            }
        }catch(Exception e){
            e.printStackTrace();
        }
      }
      synchronized static void m3(){
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
       static void m4(){
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

public class synch {
    public static void main(String[] args) {
        Test test = new Test();//main obj
        First t1 = new First(test);//sy+instance
        Second t2 = new Second(test);//sy+instance
        Thired t3 = new Thired(test);//instace
        Fourth t4 = new Fourth(test);//sy + static

        t1.setName("Thread 1 Processing...sy + instance");
        t2.setName("Thread 2 Processing... instance");
        t3.setName("Thread 3 Processing... sy + static");
        t4.setName("Thread 4 Processing... static");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
