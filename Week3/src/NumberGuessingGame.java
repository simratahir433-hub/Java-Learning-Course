// Project of Week 3

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 42;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Attempts left: " + (maxAttempts - attempts));
            } else if (guess > secretNumber) {
                System.out.println("Too high! Attempts left: " + (maxAttempts - attempts));
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                scanner.close();
                return;
            }
        }

        System.out.println("Out of attempts! The correct number was: " + secretNumber);
        scanner.close();
    }
}

