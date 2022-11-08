class MyThread2 extends Thread{ //we extend from thread class ( it is the default syntax for making a thread )
    @Override
    public void run(){  //we override the run class in the thread class
        int i = 0;
        while (true) {
            System.out.println("i am a thread t1");
            try {
                Thread.sleep(45 );
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
//            System.out.println("i am happy");
            i++;
        }
    }
}
class MyThread3 extends Thread{ //we extend from thread class ( it is the default syntax for making a thread )
    @Override
    public void run(){  //we override the run class in the thread class
        int i = 0;
        while (true) {
            System.out.println("t2 runnin' ");
//            System.out.println("i am happy");
            i++;
        }
    }
}
public class AV_75_thread_methods {
    public static void main(String[] args) {
    MyThread2 t1 = new MyThread2();
    t1.start();
//    try{
//        t1.join();
//    }
//    catch (Exception e){
//        System.out.println(e);
//    }

    MyThread3 t2 = new MyThread3();
    t2.start();
    }
}