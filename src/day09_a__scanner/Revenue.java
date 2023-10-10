package day09_a__scanner;


import java.util.Scanner;

public class Revenue {

    /*
     Write a program that asks the user to enter a price and quantity and then calculate the revenue.

     Calculation: revenue = price × quantity.

     */

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the price: $");
        double price = input.nextDouble();
        System.out.print("Enter quantity; ");
        int quantity = input.nextInt();
        double revenue = price*quantity;
        System.out.println("Revenue: $" +revenue);





    }
    
}
