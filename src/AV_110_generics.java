import java.util.ArrayList;

public class AV_110_generics{
    public static void main(String[] args) {
        // without java generics :
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10);
//        myArrayList.add("Daisuki desu!");
//        myArrayList.add(20.4);
        System.out.println(myArrayList);
        int x = myArrayList.get(0);
        System.out.println(x);
    }
}
