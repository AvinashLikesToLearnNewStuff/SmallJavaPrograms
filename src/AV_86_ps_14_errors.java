import java.util.Scanner;
class MaxRetriesExceeded extends Exception{
    public String getMessage(){
        return "Error, max retries exceeded";
    }
}


public class AV_86_ps_14_errors {
    public static void main(String[] args) {
        // syntax error int  a = 7
        //logical error
//        int age = 78;
//        int yearBorn = 2000-70;//logical error
//        System.out.println(6/0);//exception
//        try{
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("haha");
//
//        }
//        catch (ArithmeticException e) {
//            System.out.println("hehe");
//        }
        boolean flag = true;
        int [] marks = new int[3];
//        while (flag){
        marks[0] =  7;
        marks[1] =  17;
        marks[2] =  45;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i <=5){
            try {
                System.out.println("enter the value of index");
                index = sc.nextInt();
                System.out.println("the value of marks[index] is " + marks[index]);
                break;
            }catch (Exception e){
                System.out.println("invalid index");
                i++;
            }
            if (i>=5){
                try {
                    throw new MaxRetriesExceeded();
                }
                catch (MaxRetriesExceeded m){
                    System.out.println("\n" + m.getMessage());

                }
            }
        }
//        }
    }


    }
//}
