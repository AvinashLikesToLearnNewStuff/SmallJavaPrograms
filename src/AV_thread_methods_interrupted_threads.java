class AV1 extends Thread{
    public void run(){
//        try {
            for (int i = 0; i < 10; i++){
                System.out.println(i);
                //child thread is put to sleep for 400 ms as soon as the child goes to sleep main thread interrupts it.
                // And, InterruptedException is generated which is handled by the catch block. */
//                Thread.sleep(4000);
            }
//        } catch (InterruptedException e) {
//            System.out.println("child thread interrupted");
//        }
//        System.out.println("thread is runnning");
    }
}
public class AV_thread_methods_interrupted_threads {
    public static void main(String[] args) {
    AV1 t = new AV1();
    t.start();
    t.interrupt();
    System.out.println("main thread ");
    }
}
