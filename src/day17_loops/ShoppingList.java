package day17_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {


/*
    repeated steps:
        ask the user to enter the item
        add item to shopping list
        ask the user if they want to add more items

        at the end show the full shopping list

 */

        Scanner input = new Scanner(System.in);
        String list = "Shopping List:";
        String addMore = "";
        int num = 1;



        do {
            System.out.print("Enter the name of the item to your shopping list: ");
            String itemName = input.nextLine();
            list =  list +  "\n\t"+num+" "+itemName;
            System.out.print("Do you want to add more to your shopping list? ");
            addMore = input.nextLine();
            num++;


        }while (addMore.equalsIgnoreCase("yes"));

        System.out.println(list);



    }



}
