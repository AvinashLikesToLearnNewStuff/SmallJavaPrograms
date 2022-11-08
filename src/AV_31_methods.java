import org.w3c.dom.ls.LSOutput;

public class AV_31_methods {

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        x = 566;  // if we change x here, the values of a won't be changed because its just modifying a copy of a's value
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        //method inovcation using object creation
        // AV_31_methods obj = new AV_31_methods();
        //c = obj.logic(a,b);
        c = logic(a, b);
        System.out.println(c);

        int a1 = 2;
        int b1 = 1;
        //int c1 = obj.logic(a1, b1);
        int c1 = logic(a1, b1);
        System.out.println(c1);

    }
}