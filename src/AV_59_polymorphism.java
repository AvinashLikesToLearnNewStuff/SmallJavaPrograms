interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("recording in 4k");
    };
}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void  callNumber(int phoneNumber){
        System.out.println("calling"+ phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("connecting...");
    }
    void takesnap()
    {
        System.out.println("taking snap");
    }
//    public void record4kvideo(){
//        System.out.println("recording 4k video with the smartphone!");
//    }
}
class MySmartPhone extends MyCellPhone implements Wifi, Camera{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("recording video");
    }
    public String[] getNetworks(){
        System.out.println("getting list of networks");
        String[] networkList = {"Prashant5G","Nikhil's hotspot","Palak Home Wifi", "Anshul Corporate Network"};
        return networkList;
    }
    public void connectToNetwork(String Network){
        System.out.println("connecting to ..." + Network);
    }
    public void sampleMeth(){
        System.out.println("this is a method of the smartphone class");
    }
}
public class AV_59_polymorphism {
    public static void main(String[] args) {
        Camera camera1 = new MySmartPhone(); // this is a smartphone, but we can only use as a camera
       // camera1.getnetworks //this is illegal
        camera1.record4kvideo(); // we can only use camera functions if we make a smartphone object using camera reference
//        camera1.sampleMeth(); //not allowed, we cannot even use methods of the smartphone class, we can only use the camera class
    }
}