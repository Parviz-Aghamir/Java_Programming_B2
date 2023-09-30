package day11_if_statements;

import java.util.Scanner;

public class LoginApp {
    /*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
    public static void main(String[] args) {

        int pin = 1234;
        int ssn = 8213;
        Scanner key = new Scanner(System.in);
        System.out.print("Welcome to ATM! \n\t Please enter your pin-code: ");
        int enterPinCode = key.nextInt();
        System.out.print("\tPlease, enter last 4 digits of your SSN: ");
        int enteredSSN = key.nextInt();


        if (enterPinCode==pin && enteredSSN==ssn){
            System.out.println("\nAuthentication successful");
        }else {
            System.out.println("\nAuthentication failed");

            if (enterPinCode!=pin){
                System.out.println("\t\tincorrect pin code");
            }
            if (enteredSSN!=ssn){
                System.out.println("\t\tincorrect SSN");
            }

            }












    }
}
