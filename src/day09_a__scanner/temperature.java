package day09_a__scanner;

import java.util.Scanner;

public class temperature {
        /*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
     */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter temperature: ");
            int tem = input.nextInt();
            boolean result = tem>=70;
            if(result){
                System.out.println("Its a nice day");
                System.out.println("Go outside, but with your laptop to code java");
            }else{
                System.out.println("Its too cold");
                System.out.println("Code more java");
            }
        }




}
