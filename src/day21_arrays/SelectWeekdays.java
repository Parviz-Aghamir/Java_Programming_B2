package day21_arrays;

import day08_scanner_logical_operators.ScanerIntro;

import java.util.Scanner;

public class SelectWeekdays {
    public static void main(String[] args) {
        String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number that represents the weekdays: ");
        int userNum = input.nextInt();
        if (userNum >=1 && userNum<=7){
            System.out.println(weekdays[userNum-1]);
        }else {
            System.out.println("Sorry, invalid number.");
        }









    }




}
