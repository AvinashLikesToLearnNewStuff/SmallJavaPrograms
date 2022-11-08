class firstClass{
    int a;
    firstClass(){
//        System.out.println("invoking first class constructor");
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public int returnOne(){
        return 1;
    }
}
class secondClass extends firstClass{
    secondClass(int c){
//        super(c);    // if we comment this out then there is an error shown above
//        super(c); //we are calling the cosntructor of the parent class
        System.out.println("i am a constructor of second class");
    }
}
public class AV_47_this_super {
    public static void main(String[] args) {
        firstClass f = new firstClass();
        secondClass s = new secondClass(5);
//        System.out.println(f.getA());
    }
}