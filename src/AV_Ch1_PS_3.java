import java.util.Scanner;

public class AV_Ch1_PS_3 {
    public static void main(String[] args) {
        System.out.println("pls enter ur distance in km");
        Scanner sc = new Scanner(System.in);
        float distance_in_kms = sc.nextFloat();
        float distance_in_miles = distance_in_kms * 0.621371f;
        System.out.println(distance_in_miles);

    }
}
