import java.util.Scanner;
public class AV_82_Nested_try_catch {
    public static void main(String[] args) {
//        try {
            System.out.println("welcome to 1");
            int[] marks = new int[5];
            marks[0] = 7;
            marks[1] = 56;
            marks[2] = 6;
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            while (flag) {
                System.out.println("enter index");
                int ind = sc.nextInt();
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this index does not exist ");
                    System.out.println("exception in level 2");

                } catch (Exception e) {
                    System.out.println("exception in level 1");
                }
            }
            System.out.println("thanks for using this program");
//        }
    }
}

