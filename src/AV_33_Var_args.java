public class AV_33_Var_args {
    static int sum(int x, int...arr){
        int result = x;
        for (int element : arr){
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 4, 5, 6,7 is " + sum(4,5,6,7));
        System.out.println("the sum of 4, 5, 6,7, 8 is " + sum(4,5,6,7,8));
        //System.out.println("the sum of nothing is: " + sum());
}
}
