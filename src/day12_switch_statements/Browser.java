package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your browser: ");

       String browser = input.nextLine(); // In case, we have multiple words
        System.out.print("Enter your URL: "); // URL --- >  it is a link in browser
        String url = input.nextLine();
        switch (browser){
            case "chrome":
                System.out.println("Opening " + url + " in the " + browser+ " browser");
                System.out.println("Loading.......");
                break;
            case "Edge":
               System.out.println("Opening " + url + " in the " + browser+ " browser");
               System.out.println("Loading........");
                break;
            case "Safari":
            case "SAFARI":
            case "safari":
            case "SaFaRi":
                System.out.println("Opening " + url + " in the " + browser+ " browser");
                System.out.println("Welcome");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in the " + browser+ " browser");
                System.out.println("Welcome");
                break;
            default:
                System.out.println(browser+ " is not valid browser type.");
        }
    }









}
