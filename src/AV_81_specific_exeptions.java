import java.util.Scanner;

public class AV_81_specific_exeptions {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int ind = sc.nextInt();

        System.out.println("enter the number u want to divide with");
        int number = sc.nextInt();
        try{
            System.out.println("the value @ array index entered is " + marks[ind]);
            System.out.println("the value of array value divided by number is " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithametic exception ocurred");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException t){
            System.out.println("array index is wrong");
            System.out.println(t);
        }
        catch (Exception e){
            System.out.println("some other exception");
        }

    }
}
