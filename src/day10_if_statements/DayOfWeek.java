package day10_if_statements;

public class DayOfWeek {
    /*
    Declare and assign a number (day)
    1 - Monday
    2 - Tuesday
    3 - Wednesday
    4 - Thursday
    5 - Friday
    6 - Saturday
    7 - Sunday
    Ex: 2
    Tuesday
     */
    public static void main(String[] args) {
        int day =8;


        if (day ==1){
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("week have only 7 days");
        }

        System.out.println("-------------------");

        if (day ==1){
            System.out.println("Monday");
        }
        if (day==2) {
            System.out.println("Tuesday");
        }
        if (day==3) {
            System.out.println("Wednesday");
        }
        if (day==4) {
            System.out.println("Thursday");
        }
        if (day==5) {
            System.out.println("Friday");
        }
        if (day==6) {
            System.out.println("Saturday");
        }
        if (day==7) {
            System.out.println("Sunday");
        }
        System.out.println("-------------------");

    }

}
