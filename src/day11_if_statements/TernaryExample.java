package day11_if_statements;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 4;
        String evenOrODD = "";
        if (a % 2 == 0) {
            evenOrODD = "even";
        } else {
            evenOrODD = "Odd";
        }
        System.out.println(evenOrODD);

        System.out.println("---------------------------");

        evenOrODD = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrODD);
         /*
                     (a % 2 == 0)   ------ > condition
                     ?              ------ > if TRUE or FALSE
                     "Even"         ------ > first value is always for TRUE
                     :              ------ > else
                     "Odd"          ------ > second value is always for FALSE

                     firstValue and secondValue HAS TO BE SAME DATA TYPE
         */
        System.out.println("---------------------------");
        int num = 4;
        String result = (num > 10) ? "BiggerThanTen" : "NotBiggerThanTen";
        System.out.println(result);
        System.out.println("---------------------------");
        int number = -4;
        String sign = (number > 0) ? "positive" : (number < 0) ? "negative" : "Zero";
        System.out.println(sign);

        //String sign = (number > 0) ? "positive" :"negative";
        /*
                SYNTAX
                        (condition) ? value1 : value2
         */

        // This is same as the one above.
        if (number > 0) {
            sign = "positive";
        } else {
            if (number < 0) {
                sign = "negative";
            } else {
                sign = "zero";
            }
        }


    }

}








