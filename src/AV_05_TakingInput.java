import java.util.Scanner;

public class AV_05_TakingInput {
    public static void main(String[] args) {
        System.out.printf("Taking input from the user ");
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number 1");
//        int a = sc.nextInt();
//        System.out.println("enter number 2");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println("the sum of these numbers is ");
//        System.out.println(sum);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
