import java.util.*;
public class AV_91_array_list {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(8);
       l2.add(20);
        l2.add(21);
        l2.add(22);



        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(0,5);
        l1.addAll(l2);
//        l1.clear();
        l1.set(0, 9999);
        System.out.println(l1.indexOf(3));
        for (int i = 0 ; i < l1.size() ; i++){
            System.out.print(l1.get(i));
            System.out.print( " , ");
        }
    }
}
