package Basics;
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
            Random random = new Random();
            Scanner sc = new Scanner(System.in);
            int numberToGuess = random.nextInt(100) + 1;// Generate a random number between 1 and 100
            int numberOfAttempts = 0;
            int playerGuess = 0;
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I am thinking of a number between 1 and 100.");
            System.out.println("Can you guess what it is?");// Loop runs until player guess the correct number
            while (playerGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                playerGuess = sc.nextInt();
                numberOfAttempts++;
                // Check if the guess is too high, too low, or correct
                if (playerGuess > numberToGuess) {
                    System.out.println("Too high! Try a smaller number.");
                } else if (playerGuess < numberToGuess) {
                    System.out.println("Too low! Try a larger number.");
                } else {
                    System.out.println("Congratulations! You found the number!");
                    System.out.println("It took you " + numberOfAttempts + " attempts.");
                }
            }
    }
}