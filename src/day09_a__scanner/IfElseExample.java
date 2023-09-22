package day09_a__scanner;

public class IfElseExample {
    /*
        int score = 60;
        if (score >= 75){  // false
            System.out.println("You passed the exam!");
        }

        if (score < 75) {  // true
            System.out.println("You failed!");
        }
     */
    public static void main(String[] args) {
        int score = 80;
        if (score >=75){
            System.out.println("Passing!");
        } else {
            System.out.println("Failing");
        }

        System.out.println();

    int year =2021;
    boolean isLockdown = year == 2020|| year ==2021;
    if (isLockdown){
        System.out.println("Stat at home");
        System.out.println("Study Java");
    }else{
            System.out.println("Party");
            System.out.println("travel");}




    }

}
