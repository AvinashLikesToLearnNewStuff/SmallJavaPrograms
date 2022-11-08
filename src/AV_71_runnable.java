class MythreadRunnable1 implements Runnable{
    int i = 0;
    public void run(){
        while (i < 40000) {
            System.out.println("thread 1 is here for your service (●'◡'●)");
            i++;
        }
    }
}
class MythreadRunnable2 implements Runnable{
    int i = 0;
    public void run(){
        while (i < 40000) {
            System.out.println("i am a thread, thread 2");
            i++;
        }
    }
}
public class AV_71_runnable {
    public static void main(String[] args) {
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
