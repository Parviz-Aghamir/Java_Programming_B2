package day09_a__scanner;

import java.util.Scanner;

public class YourInfo {
        /*
        Ask the user to enter their age (byte),
        ask them to enter their favorite number (long),
        and ask them to enter their favorite book
        Print all the values from the inputs
     */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            byte age = input.nextByte();
            System.out.println("Enter your favorite number: ");
            long favoriteNum = input.nextLong();
            System.out.println("Enter your favorite book; ");
            input.nextLine();
            String book = input.nextLine();


            System.out.println("Your age: " +age);
            System.out.println("Enter your favorite number: " + favoriteNum);
            System.out.println("Enter your favorite book " +book);


        }


}
