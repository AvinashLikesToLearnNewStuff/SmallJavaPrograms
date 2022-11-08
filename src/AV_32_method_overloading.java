public class AV_32_method_overloading {
    static void foo(){
        System.out.println("I love you!");
    };
    static void foo(int a){
        System.out.println("I love you " + a + "!");
    }
    static void foo(int a, int b){
        System.out.println("I love you " + a + " " + b + "!");
    }
    //static int foo(int a, int b){
    //    System.out.println("I love you " + a + " " + b + "!");
    //    return 3;
    //}

    static void change(int a) {
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("Just burned 2,000\n" +
                "calories. That's the last\n" +
                "time I leave brownies\n" +
                "in the oven while I nap.\n");
    };
    public static void main(String[] args) {
   // tellJoke();
        //case 1: changing the integer
        //int x = 45;
        //change(x);
        //System.out.println(" the value of marks after running change is "+ x);
        //case 2: changing the array
        //int [] marks = {52, 73, 77, 89,98, 84};
        //change2(marks);
        //System.out.println("the value of x after running change is "+ marks[0]);
        foo();
        foo(3000);
       foo(3000,4000);
    }
}
