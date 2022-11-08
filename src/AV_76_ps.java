class GoodMorning extends Thread{
    public void run(){
        int i = 0;
        while (i<99999){
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e){
            System.out.println("thread sleeps");
        }
            System.out.println("good morning");
        }
        }
        }
class Welcome extends Thread{
    public void run(){
        int i = 0;
        while (i<99999){

            System.out.println("welcome");
        }
    }
}
public class AV_76_ps {

    public static void main(String[] args) {
    GoodMorning AlarmClock = new GoodMorning();
    Welcome Mat = new Welcome();
    AlarmClock.setPriority(9);
    Mat.setPriority(1);
        System.out.println(AlarmClock.getPriority());
        System.out.println(Mat.getPriority());
        System.out.println(AlarmClock.getState());
//    AlarmClock.start();
//    Mat.start();
    }
}
