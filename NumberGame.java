import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1; // Minimum number in the range
        int max = 100; // Maximum number in the range
        int secretNumber = random.nextInt(max - min + 1) + min; // Generate a random number

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + min + " and " + max + ". Can you guess it?");

        int attempts = 0;
        boolean hasGuessed = false;

        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < min || guess > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                hasGuessed = true;
            }
        }

        scanner.close();
    }
}
