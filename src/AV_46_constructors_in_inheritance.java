class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("i am an overloaded +  constructor with value of x as : " + x);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;

}
class derived1 extends base1{

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    derived1(){
//        super(0);
        System.out.println("i am a derived class constructor");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("i am an overloaded +  constructor with value of y as : " + y);
    }
}
class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("i am a child of the derived class");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("i am an overloaded +  constructor with value of z as : " + z);
    }
}

public class AV_46_constructors_in_inheritance {
    public static void main(String[] args) {
    //base1 b = new base1();
//    derived1 d = new derived1(4, 9);
        childOfDerived c = new childOfDerived(2,3,5);

    }
}
