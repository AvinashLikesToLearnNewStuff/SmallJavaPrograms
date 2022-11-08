class MyThr extends Thread implements Runnable{
    public MyThr(String name){
        super(name); // we are calling the thread class constructor that takes name

    }
    public void run(){
        int i = 35;
//        while (true){
            System.out.println("i am a thread");
//        }
    }
}


public class AV_72_constructors_for_thread_class {
    public static void main(String[] args) {
    MyThr t = new MyThr("Testy"); //runnable/bullet
    Thread cd = new Thread(t); //runner/gun
    cd.start();
    System.out.println(" the id of th thread is " + cd.getId());
    System.out.println(" the name of th thread is " + t.getName());
//    MyThr t2 = new MyThr("Besty");
//    t2.start();
//        System.out.println(" the id of th thread is " + t2.getId());
//        System.out.println(" the name of th thread is " + t2.getName());
    }
}
