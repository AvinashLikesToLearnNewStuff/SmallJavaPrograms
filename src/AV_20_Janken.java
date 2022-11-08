import java.util.Random;
import java.util.Scanner;

public class AV_20_Janken {
    public static void main(String[] args) {
        System.out.println();
        Random rn = new Random();
        int random_number = rn.nextInt(1,4); //creating a random number
        int rock = 1;
        int paper = 2;
        int scizzor = 3;



        Scanner sc = new Scanner(System.in);  //taking user input and showing rock paper scissor accordingly
        System.out.println("enter 1 for rock 2 for paper and 3 for scizzor");
        int user_input = sc.nextInt();
        System.out.println("you have chosen ");
        switch (user_input){
            case 1 -> System.out.println("rock");
            case 2 -> System.out.println("paper");
            case 3 -> System.out.println("scizzor");
        }


        System.out.print("the computer's choice is " ); //printing out the choice that computer made
        switch (random_number){
            case 1 -> System.out.println("rock");
            case 2 -> System.out.println("paper");
            case 3 -> System.out.println("scizzor");
        }

        //checking who won
        if (user_input==random_number) {
            System.out.println("draw");
        }
        else if (user_input==1&&random_number==2||user_input==2&&random_number==3||user_input==3&&random_number==1)  {
            System.out.println("pc won");
        }
        else if (user_input==3&&random_number==2||user_input==2&&random_number==1||user_input==1&&random_number==3)   {
            System.out.println("u won");
        }

    }
}
