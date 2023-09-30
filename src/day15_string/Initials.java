package day15_string;

import java.util.Scanner;

public class Initials {

    /*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.next();
        System.out.print("Enter last name: ");
        String lastName = input.next();
        String initials = ""+firstName.charAt(0)+lastName.charAt(0);
        System.out.println("Your initial: " +initials.toUpperCase());

    }




}
