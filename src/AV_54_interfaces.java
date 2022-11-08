interface Bicycle{
    int Swag = 100;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface hornBicycle{
    void JBhorn();
    void ArianaGrandeHorn();
}
class AvonCycle implements Bicycle, hornBicycle{
    public void JBhorn(){
        System.out.println("maybe we, can be, be eachother's companyyy pii piii~ ");
    }

    public void ArianaGrandeHorn(){
        System.out.println("I am so into you, into you uwu pu puu~ ");
    }
    void blowHorn(){
        System.out.println("pee pee poo poo ");
    }
    public void applyBrake(int decrement){
        System.out.println("applying brake! scrrrrrruuuuummmmmmm!");
    }
    public void speedUp(int increment){
        System.out.println("speeding up! wheeeeeeeee~");
    }
}


public class AV_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleRX660 = new AvonCycle();
        cycleRX660.applyBrake(3);
        System.out.println(cycleRX660.Swag);
//        cycleRX660.Swag = 999;
        cycleRX660.blowHorn();
        cycleRX660.JBhorn();
        cycleRX660.ArianaGrandeHorn();
    }
}
