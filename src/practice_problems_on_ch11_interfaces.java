interface TvRemote extends SmartTvRemote{
    void changeChannel();
    }
interface SmartTvRemote{
    void speakToType();
}
class TV implements TvRemote{

    @Override
    public void changeChannel() {
        System.out.println("pippp pipp channel switched!");
    }

    @Override
    public void speakToType(){
        System.out.println("voice typing on!");
    }
}
public class practice_problems_on_ch11_interfaces {
    public static void main(String[] args){
        TvRemote samsung = new TV();
        samsung.changeChannel();
    }
}
