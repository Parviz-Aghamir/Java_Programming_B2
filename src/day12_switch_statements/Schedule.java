package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    /*
 Task:

    Ask the user to enter which day it is
    print which class we have on that day, and the time of the class

    topic with instructor at time

    challenge:
        make each day flexible

            monday
            Monday
            mon

         reduce repeating code

 */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("What day is it and what it is about?  ");
        String day = key.next();
        String result = "";
        switch (day){
            case "Monday":
                result = "No classes for now, but it will soon start." +
                        "\nIt will be mentor sessions from 7pm-10pm EST.\nMentor sessions will not be recorded. ";
                break;
            case "Tuesday":
                result = "No classes. Champion league doing Java task";
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                result = "We are having Java classes with Feyruz";
                break;
            case "Friday":
                result = "No classes but get ready for Saturday long hours";
                break;
            case "Sunday":
                result = "We are having Java classes with Nadir";
                break;
            default:
                result = "Not invalid day of week";



        }
        System.out.println(result);

    }


}
