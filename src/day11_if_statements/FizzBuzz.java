package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
        /*
           you will have a number

           if the number is divisible by 3 print -> Fizz
           if the number is divisible by 5 print -> Buzz
           if the number is divisible by both 3 and 5 -> FizzBuzz
           if the number is not divisible by any of those, print just the number
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        String result ="";

        if (num%3==0 && num%5 == 0){
            result = "FizzBuzz";
        } else if (num%3==0 && num%5>0) {
            result= "Fizz";
        } else if (num%3>0 && num%5==0) {
            result ="Buzz";
        }else{
            result= ""+ num;
        }

        System.out.println(result);









    }








}
