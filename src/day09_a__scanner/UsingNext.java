package day09_a__scanner;

import java.util.Scanner;

public class UsingNext {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is today? ");
        String day = input.nextLine();
        System.out.println("Enter your first name: ");
        String name = input.next();
        System.out.println("Today: " +day);
        System.out.println("First name: " +name);

        System.out.println("Enter your last name: ");
        String lastname =input.next();

        input.nextLine();
        System.out.println("Enter your bank account username: ");
        String userName = input.nextLine();
        System.out.println("Enter your address: ");
        String address = input.nextLine();
        System.out.println("Last name: " +lastname);
        System.out.println("Address: " +address);
        System.out.println("Your bank username: " + userName );




    }


}
