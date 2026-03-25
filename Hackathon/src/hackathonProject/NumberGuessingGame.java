package hackathonProject;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly!");
                    System.out.println("Number of attempts: " + numberOfAttempts);
                    guessedCorrectly = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Try again! The number I'm thinking of is higher.");
                } else {
                    System.out.println("Try again! The number I'm thinking of is lower.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.next();

            if (!playAgainChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing! Goodbye!");
            }
        }

        scanner.close();
    }
}
