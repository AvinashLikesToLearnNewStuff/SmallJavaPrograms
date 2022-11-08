interface LambaExp{
void meth1(int a, int b);
}
public class AV_110_anonymous_classes {
    public static void main(String[] args) {
    LambaExp obj = ((a, b) -> System.out.println("the value of a and b is : " + a + ","  + b));
    obj.meth1(5,10);
    }
}
