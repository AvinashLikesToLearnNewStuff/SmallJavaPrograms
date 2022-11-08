//interface Camera{
//    void takeSnap();
//    void recordVideo();
//    private void greet(){
//        System.out.println("good morning");
//    }
//    default void record4kvideo(){
//        greet();
//        System.out.println("recording in 4k");
//    };
//
//}
//interface Wifi{
//    String[] getNetworks();
//    void connectToNetwork(String network);
//
//}
//class MyCellPhone{
//    void  callNumber(int phoneNumber){
//        System.out.println("calling"+ phoneNumber);
//    }
//    void pickCall(int phoneNumber){
//        System.out.println("connecting...");
//    }
//    void takesnap()
//        {
//        System.out.println("taking snap");
//    }
////    public void record4kvideo(){
////        System.out.println("recording 4k video with the smartphone!");
////    }
//}
//class MySmartPhone extends MyCellPhone implements Wifi, Camera{
//    public void takeSnap(){
//        System.out.println("taking snap");
//    }
//    public void recordVideo(){
//        System.out.println("recording video");
//    }
//    public String[] getNetworks(){
//        System.out.println("getting list of networks");
//        String[] networkList = {"Prashant5G","Nikhil's hotspot","Palak Home Wifi", "Anshul Corporate Network"};
//        return networkList;
//    }
//    public void connectToNetwork(String Network){
//        System.out.println("connecting to ..." + Network);
//
//    }
//}
//public class AV_57_default_methods {
//    public static void main(String[] args) {
//       MySmartPhone ms = new MySmartPhone();
//        ms.record4kvideo();
//       String[] ar= ms.getNetworks();
//        for (String item: ar) {
//            System.out.println(item);
//        }
//    }
//}
