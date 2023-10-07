package day17_loops;

import java.util.Scanner;

public class MinAndMax {
    /*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
     */

/*
    repeated steps:

        ask for a number

        check is it the biggest

        check is it the smallest


 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highest =Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        int counter = 1;
        int num= 1;


        while (counter<=5){
            System.out.print("Enter number "+num+": ");
            int userNumber = input.nextInt();



            if (userNumber>highest){
                highest = userNumber;
            }
            if (userNumber<lowest){
                lowest= userNumber;
            }
            counter ++;
            num ++;


        }
        System.out.println("Max: " +highest);
        System.out.println("Min: " +lowest);













    }


}
