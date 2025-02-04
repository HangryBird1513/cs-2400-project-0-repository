// 
// Name: Evan Liang
// Course: CS 2400
// Date: 2/4/25
// Description: This program allows the user to guess a randomly generatored number as many times as they like.
//

import java.util.Scanner;

public class NumberGuess
{
    public static void main(String[] args)
    {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int min = 10;
        int max = 50;
        int range = max - min + 1;
        int randomNum = (int)(Math.random() * range) + min;
        int guessedNum = -1;
        int guesses = 0;

        // Introduction
        System.out.println("I'm thinking of a number between " + min + " and " + max + ". Can you guess what it is?");

        // Loop iterates until user guesses the number correctly
        while (guessedNum != randomNum)
        {
            // Each iteration of loop represents a guess
            guesses++;

            // Prompt user to input their guess
            System.out.print("\nGuess " + guesses + ": ");
            guessedNum = input.nextInt();
            
            // Handles whether or not user's guess is in the range of possible numbers
            if (guessedNum < min || guessedNum > max)
            {
                System.out.println("That number isn't between " + min + " and " + max + ".");
            }
            else
            {
                // Handles whether or not user guessed the number correctly
                if (guessedNum > randomNum)
                {
                    System.out.println("That number is greater than the one I'm thinking of.");
                }
                else if (guessedNum < randomNum)
                {
                    System.out.println("That number is less than the one I'm thinking of.");
                }
                else
                {
                    System.out.println("Congrats, that's the number I was thinking of! It took you " + guesses + " guess(es) to guess it correctly!");
                }
            }
        }
    }
}