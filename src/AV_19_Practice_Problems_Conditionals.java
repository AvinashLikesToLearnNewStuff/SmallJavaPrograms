import java.util.Scanner;
public class AV_19_Practice_Problems_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a website");
        String name = sc.nextLine();
        if (name.endsWith(".com")){
            System.out.println("the site is a commercial website");
        }
        else if (name.endsWith(".org")){
            System.out.println("the site is a organisational website");
        }
        else if (name.endsWith(".in")){
            System.out.println("the site is a indian website");
        }
    }
}
