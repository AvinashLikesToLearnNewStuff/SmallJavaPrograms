import java.util.Scanner;


public class AV_05_Excercise_Marks_Calculator {
    public static void main(String[] args) {
        System.out.println("Enter marks of:");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of English");
        int english = sc.nextInt();
        System.out.println("enter marks of Maths");
        int maths = sc.nextInt();
        System.out.println("enter marks of French");
        int french = sc.nextInt();
        System.out.println("enter marks of Japanese");
        int japanese = sc.nextInt();
        System.out.println("enter    marks of Science");
        int science = sc.nextInt();
        float percentage = (((english + maths + french + japanese + science)) * 100)/500;
        System.out.println(percentage);

    }
}
