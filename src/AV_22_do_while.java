import java.util.Scanner;

public class AV_22_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the natural number n u want numbers to be printed till ");
        int n = sc.nextInt();
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while (b < n);
    }
}
