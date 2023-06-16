import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;

        Scanner in = new Scanner(System.in);

        int userGuess;
        do {
            System.out.println("Guess the number (between 1 and 10): ");
            if(in.hasNextInt())
            {
                userGuess = in.nextInt();
            }
            else {
                System.out.println("You did not enter an integer!");
                in.nextLine();
                userGuess = -1;
            }
        } while (userGuess < 1 || userGuess > 10);

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed it correctly.");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }

        System.out.println("The random number was: " + randomNumber);
    }
}
