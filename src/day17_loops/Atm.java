package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner key =new Scanner(System.in);



        int validPin = 1234;
        int userPin;
        int attemptCount = 0;

        System.out.println("Welcome ATM!");

        do {
            System.out.print("Enter your pin: ");
            userPin = key.nextInt();
            attemptCount++;
        }while (userPin!=validPin && attemptCount<3);
        if (userPin==validPin){
            System.out.println("You are logged in!");
        }else {
            System.out.println("Lock out!");
        }







    }






}
