class C1{
    public int x = 5;               //public
    protected int y = 6;            //protected
    int z = 7;                      //no modifier/default
    private  int a = 8;             //private
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class AV_66_access_modifiers {
    public static void main(String[] args) {
    C1 c1 = new C1();
//    c1.meth1();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
//        System.out.println(c1.a);
    }
}


