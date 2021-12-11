import java.util.Random;
import java.util.Scanner;

public class Exercises {
    //excercise 5.7 pg 83
    //Now that we have conditional statements, we can get back to
    //the \Guess My Number" game from Exercise 3.4.
    //You should already have a program that chooses a random number, prompts
    //the user to guess it, and displays the difference between the guess and the
    //chosen number.
    //Adding a small amount of code at a time, and testing as you go, modify the
    //program so it tells the user whether the guess is too high or too low, and then
    //prompts the user for another guess.
    //The program should continue until the user gets it right. Hint: Use two
    //methods, and make one of them recursive.

    public static void guessingGame(int x, int y){

        if (x==y){
            System.out.println("You got it!");
        }
        else{
            if (x>y){
                System.out.println("Too high by: "+(x-y));
                System.out.println("Please enter a number2: ");
                Scanner in = new Scanner (System.in);
                x = in.nextInt();
                guessingGame(x,y);
            }
            else {
                System.out.println("Too low by: " + (y - x));
                System.out.println("Please enter a number3: ");
                Scanner in = new Scanner(System.in);
                x = in.nextInt();
                guessingGame(x, y);
            }
        }
    }

    public static void startGuess(Scanner in){
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println("Please enter a number1: ");
        int guess = in.nextInt();
        guessingGame(guess, number);
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    startGuess(in);
    }
}
