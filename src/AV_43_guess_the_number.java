import java.util.Random;
import java.util.Scanner;

class Game{
    int computerInput;
    int userInput;
    private int noOfGuesses = 0;
    public Game(){
        Random random = new Random();
        computerInput = random.nextInt(1,10);
    }
    boolean isCorrectNumber;


    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your guess");
        userInput = sc.nextInt();
        setNoOfGuesses();//guess increase by 1
        isCorrectNumber();//we validate the guesses
        return userInput;
    }

    public boolean isCorrectNumber(){  //validation
        if (userInput == computerInput){  //if we input correct no

            System.out.println("the guess of computer was "+ computerInput);
            System.out.println("you won");  //print we won
            System.out.println(getNoOfGuesses()); //print no of guesses

            return true; //seems useless
        }
        else {
            if (userInput > computerInput){
                System.out.println("try guessing lower");
            }
            else if (userInput < computerInput) {
                System.out.println("try guessing higher");
            }
            System.out.println("try guessing again"); //if false
            takeUserInput();                           //take input again
            return true;
        }
    }

    public void setNoOfGuesses() {
        if (!isCorrectNumber){
            System.out.println("incrementing no of guesses by one " );
            noOfGuesses += 1;
//            for (int i = 0; i<=10; i++ ) {
//                noOfGuesses += i;
//            }
//            return noOfGuesses;
        }

//        takeUserInput();
    }


    public int getNoOfGuesses() {
        System.out.println("your number of guesses were");
        return noOfGuesses;
    }
}








public class AV_43_guess_the_number {
    public static void main(String[] args) {
    Game newGame = new Game();
    newGame.takeUserInput();

    }

}
