package day15_string;

import java.util.Scanner;

public class Title2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name withy title: ");
        String name= input.nextLine().toLowerCase();

        if (name.startsWith("mr") || name.startsWith("mister")) {
            System.out.println("Hello Sir ");
        } else if (name.startsWith("ms.")|| name.startsWith("miss")|| name.startsWith("madam")){
                System.out.println("Hello Madam ");
        } else if (name.startsWith("dr.")) {
            System.out.println("hello doctor");
        }else {
            System.out.println("There is no title");
        }



        if (name.endsWith(" sr")) {  // name "Tesr"
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith("jr")) {
            System.out.println("Nice to meet you Junior");
        } else {
            System.out.println("No Senior or Junior");
        }








    }



}
