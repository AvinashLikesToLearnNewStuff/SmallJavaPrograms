class circle1{
    int radius;
    circle1(){
        System.out.println("i am non parameterised/default constructor of circle, I won't run if u use super(r)");
    }
    circle1(int r){
        System.out.println("i am circle parameterised constructor");
        this.radius = r;
    }
    public void area(){
        System.out.println(2*Math.PI*radius*radius);
    }
}

class cylinder1 extends circle1{
    int height;
    double volume;
    cylinder1(int r, int h){
        super(r);
        System.out.println("i am cylinder parameterised constructor");
        this.height = h;
    }
    public double getVolume(){
        volume = Math.PI * this.radius * this.radius * this.height;
        return volume;
    }
}
public class AV_51_ps_inheritance {
    public static void main(String[] args) {
        cylinder1 cylinder1 = new cylinder1(12,4);
        circle1 circle1 = new circle1(13);
//        cylinder1.setRadius(2);
//        cylinder1.setHeight(3);
        System.out.println(cylinder1.getVolume());;
        circle1.area();
    }
}