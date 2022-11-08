public class AV_34_Recursion_in_Java {
    static int fibonacci_series(int n){
        if (n <=1){
            return n;
        }
        else{
            return fibonacci_series(n-1) + fibonacci_series(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("the value of factorial n is : " + fibonacci_series(n));
    }
}
