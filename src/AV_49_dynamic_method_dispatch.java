class Phone{
    public void showTime(){
        System.out.println("time is 8 am");
    }
    public void turnOn(){
        System.out.println("turning on phone...");
    }
}
class Smartphone extends Phone{
    public void playMusic(){
        System.out.println("tu...tu...ruuu~");
    }
    public void turnOn() {
        System.out.println("turning on smartphone");
    }
}
public class AV_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//    Phone obj = new Phone(); //a phone object is created at runtime
//    Smartphone smobj = new Smartphone();
    Phone obj = new Smartphone();    //allowed
//    Smartphone smobj = new Phone();  //not allowed
        obj.turnOn();
        obj.showTime();

    }
}