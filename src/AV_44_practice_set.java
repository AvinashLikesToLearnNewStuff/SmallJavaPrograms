class rectangle{
    private int length;
    private int breadth;
    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double volume(){
        double volume;
        volume = 3.14 * length * length * breadth;
        return volume;
    }
    public void setlength(int user_length){
        this.length = user_length;
    }

    public void setbreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }

}
public class AV_44_practice_set {
    public static void main(String[] args) {
    rectangle newrectangle = new rectangle(12,9);
//    newrectangle.setbreadth(12);
//    newrectangle.setlength(5);
        System.out.println(newrectangle.getbreadth());
        System.out.println(newrectangle.getlength());
        System.out.println(newrectangle.volume());
    }
}
