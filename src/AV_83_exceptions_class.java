import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return  " i am to string";
    }
    public String getMessage(){
        return " i am get message";
    }
}
class MAxAgeException extends Exception{
    public String toString(){
        return  " age cannot be greater than 125";
    }
    public String getMessage(){
        return " make sure thaat age entered is correct ";
    }
}
public class AV_83_exceptions_class {
    public static void main(String[] args) {
    int a = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
    if (a < 99){
        try{
//        throw new MyException();
        throw new ArithmeticException("this is an aritmetic exception");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("finished");
            }
        System.out.println("yes finished");
        }
    }
}
