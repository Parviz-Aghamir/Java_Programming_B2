package day10_if_statements;

import java.util.Scanner;

public class OverTime {
    /*

       create a double variable for your hourly rate
       create a double variable for the number of hours worked

       calculate your net pay, with consideration of overtime pay

           if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
               (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
    */
    public static void main(String[] args){
    Scanner key = new Scanner(System.in);
        System.out.print("What is your hourly rate:");
    double hourlyRate= key.nextDouble();
        System.out.print("How many hours you worked: ");
    double numHours= key.nextDouble();
    double netPay;
    double overTimeHours;
    String message;
/*
    if numHours>40{
    overTimeHours = numHours-40;
    netPay= hourlyRate*40+overTimeHours*hourlyRate*1.5
    message = "You worked 42 hours at rate of $60, but 2 of the hours were overtime,
    so you got an additional pay for those hours. Your net pay is +netPay"
    }else{

    netPay= hourlyRate*numHours
    message = "You worked 42 hours at rate of $60, but 2 of the hours were overtime,
    so you got an additional pay for those hours. Your net pay is +netPay"}
    System.out.println(message); */

        if (numHours>40) {
            overTimeHours = numHours - 40;
            netPay = hourlyRate * 40 + overTimeHours * hourlyRate * 1.5;
            message = "You worked " + numHours + " hours at rate of $" + hourlyRate+ ", but " + overTimeHours + " of the hours were overtime, " +
                    "so you got an additional pay for those hours. Your net pay is $" + netPay;
        }else {
            netPay= hourlyRate*numHours;
            message= "You worked "+numHours+ " hours at a rate of $"+hourlyRate+" your net pay is $"+netPay;
        }
        System.out.println(message);


        }
}

