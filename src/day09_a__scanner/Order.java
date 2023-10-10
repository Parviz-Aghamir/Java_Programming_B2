package day09_a__scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        /*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
        */
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a product name: ");
        String productName = key.nextLine();

        System.out.print("Please, enter price for a " + productName+ ": $");
        double price = key.nextDouble();

        System.out.print("How many: " + productName+ " do you want to buy? ");
        int quantity = key.nextInt();

        key.nextLine();
        System.out.print("What should put on your order name: " );
        String fullName = key.nextLine();

        double total = price*quantity;
        System.out.print(fullName + ", your order for " + quantity + " "+  productName + " has been placed. Your total is $" + total);

    }




}
