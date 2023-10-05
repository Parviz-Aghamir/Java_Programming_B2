package day14_string;



import java.util.Scanner;

public class Login {

        /*

        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system password: "loopcamp2023"

        -> if the entered password matches the system password
            logged in

            otherwise print:

            invalid password

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = input.next();
        username = username.toLowerCase();
        System.out.print("Enter your password: ");
        String password = input.next();
        String actualPasswordInDB = "loopcamp2023";
       // String actualusername = "loopcamp";


        if (username.equals("java") && password.length() > 8 && password.equals(actualPasswordInDB)) {

            System.out.println("logged in");

        } else {
            if (!username.equals("java")) {
                System.out.println("invalid username");
            } else {
                System.out.println("Invalid Password");
            }


        }
    }
}