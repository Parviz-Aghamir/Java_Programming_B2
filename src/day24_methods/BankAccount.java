package day24_methods;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {


        /*
            0 - full name
            1 - account type
            2 - account number
            3 - balance
         */
    public static void main(String[] args) {
        // Ask a user to enter how many account there will be
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many account are there: ");
        int numOfAcc = input.nextInt();

        String [][] allAccounts = new String[numOfAcc][4];
        String [] question = {"Name: ", "Account Type: ", "Account Number: ", "Balance: " };
        input.nextLine();



        for (int k = 0; k < allAccounts.length; k++) {

            System.out.print("Question for acc.num. " + (k+1)+": ");

            for (int i = 0; i < question.length; i++) {
                System.out.print(question[i]);
                allAccounts[k][i] = input.nextLine();

            }
            System.out.println("Details: "+Arrays.toString(allAccounts[k]));
        }


        System.out.println("*********************");

        





            


//            String accType = input.nextLine();
//            String accNum = input.nextLine();
//            String balance = input.nextLine();







        String [] bankAcc1 = {"Tom Jerry", "Saving", "1111-2222-3333", "100,000"};
        System.out.println("Number of elements: " + bankAcc1.length);  //4
        System.out.println("Whole Array: " + Arrays.toString(bankAcc1));
        System.out.println("Name: "+bankAcc1[0]);
        System.out.println("Account Type: " + bankAcc1[1]);
        System.out.println("Account Number: " + bankAcc1[2]);
        System.out.println("Balance: " + bankAcc1[3]);












    }
}
