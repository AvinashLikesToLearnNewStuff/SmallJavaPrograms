class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
        //calling constructor of thread class
    }
    public void run(){
        //overrriding run method
        int i = 42;
        while (true){
            System.out.println( "Thank u " + this.getName() );
        }
    }
}
public class AV_74_thread_priorities {
    public static void main(String[] args) {

        MyThr1 t1 = new MyThr1("Thread 1");
        MyThr1 t2 = new MyThr1("Thread 2");
        MyThr1 t3 = new MyThr1("Thread 3");
        MyThr1 t4 = new MyThr1("Thread 4");
        MyThr1 t5 = new MyThr1("Thread 5, I am superior \\(￣︶￣*\\))");
        t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
//		t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }



}
