public class AV_35_practice_set_on_methods {
    static float average_function(int ...arr){
        float  total = 0;
        for (int number : arr){

            total += arr[number -1 ];


        }
        float average;
        return  average = total/arr.length;
    }

    public static void main(String[] args) {
        System.out.println(average_function(1,2,3,4,5,6,7,8,9,10));

        System.out.println(average_function(1,2,3,4,5,6,7,8,9,10));
    }

}
