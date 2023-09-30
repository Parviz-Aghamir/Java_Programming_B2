package day10_if_statements;

public class DaysInMonth {
    /*
       31 days ---> 1,3,5,7,8,10,12
       30 days ---> 4,6,9,11
       28 days ---> 2

     */
    public static void main(String[] args) {
        int month = 6; // 1 is January
        boolean is31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean is30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean is28 = month == 2;


        if (is31) {
            System.out.println("This month has 31 days");
        }
        if (is30) {
            System.out.println("This month has 30 days");
        }
        if (is28) {
            System.out.println("This month has 28 days");
        }
        System.out.println("-------------");


        if (is31) {
            System.out.println("This month has 31 days");
        } else if (is30) {
            System.out.println("This month has 30 days");
        } else if (is28) {
            System.out.println("This month has 28 days");
        }

        System.out.println("-------------");
        char letter = 'a';
        if (letter == 'a'){
            System.out.println("hello");
        }
        if (letter == 'a'){
            System.out.println("bye");
            }

        System.out.println("-------------");

        if (letter == 'a'){
            System.out.println("hello2");
        } else if (letter == 'a'){
            System.out.println("bye");
        }

        System.out.println("-------------");

        int num = 0;

        if (num>3){
            System.out.println( "bigger than 1");
        }else if (num>2){
            System.out.println("bigger than 2");
        }else if (num>1){
            System.out.println("bigger than 3");
        }

        System.out.println("-------------");
        int num2 = 5;
        char letter2 = 'a';

        if (num> 3){
            System.out.println("number is bigger");
        }
        if (letter2 == 'a'){
            System.out.println("Letter is equal");
        }
    }
}
