package day13_string;

import java.util.Scanner;

public class Calculator {

    /*
declare and assign 2 number variables
declare and assign a String variable for an operator

create a calculator based on the operator picked
    + : add num1 and num2
    - : minus num1 and num2
    * : multiply num1 and num2
    / : divide num1 and num2
    any other char: "invalid operator"
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2:");
        int num2 = input.nextInt();
        System.out.print(" pick operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\tEnter: ");
        String operator = input.next();
        int result = 0;
        String message;
        boolean runOrNotRun= false;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                message="Invalid operator ";
                runOrNotRun=true;
                System.out.println(message);
                break;
        }
        //if (if default is run, do not run this if statement)
        // (operator equals + || operator equals - || operator erquals * || .............) ---- >  this will work as well.
        if (!runOrNotRun) {
            System.out.println("You entered which are" + num1 + "and" + num2 + "\nWith the operator you selected, the result is: " + result);
        }
    }


}