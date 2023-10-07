package day17_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int secretNumber = 77;
        int guess;

        do {
            System.out.print("Guess a number from 1-100: ");
            guess = input.nextInt();
            if (guess> secretNumber){
                System.out.println(guess+ " to high try lower.");
            }else if (guess < secretNumber){
                System.out.println(guess+ " lower try higher");
            }

        }while (guess!= secretNumber);

        System.out.println("You guessed it correct");





    }


}
