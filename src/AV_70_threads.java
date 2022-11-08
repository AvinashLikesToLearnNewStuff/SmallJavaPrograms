class MyThread1 extends Thread{ //we extend from thread class ( it is the default syntax for making a thread )
    @Override
    public void run(){  //we override the run class in the thread class
        int i = 0;
        while (i < 40000) {
            System.out.println("my cooking thread is running ");
            System.out.println("i am happy");
            i++;
        }
    }
}

class MyThread5 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i < 40000) {
            System.out.println("thread 2 for chatting with her");
            System.out.println("i am sad");
            i++;
        }
    }
}

class MyThread10 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i < 40000) {
            System.out.println("thread 3 for watching anime");
            System.out.println("i am enjoying");
            i++;
        }
    }
}
public class AV_70_threads {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    MyThread3 t3 = new MyThread3();

    t1.start();
    t2.start(); //start method is used to run a thread // it calls the run method on its own, so we don't have to run it
    t3.start();

    }
}
