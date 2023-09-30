package day10_if_statements;

import java.util.Scanner;

public class BiggestNumber {

  /*declare and assign 3 int variables
  between the 3 numbers find the print the biggest one
   */
  public static void main(String[] args) {
      Scanner key = new Scanner(System.in);
      System.out.print("Enter three number: ");
      int num1= key.nextInt();
      int num2= key.nextInt();
      int num3= key.nextInt();
      if (num1>=num2 && num1>=num3){
          System.out.println(num1+ " is the biggest one");
      } else if (num2>=num1 && num2>=num3) {
          System.out.println(num2+ " is the biggest one");
      } else if (num3>=num1 &num3>=num1) {
          System.out.println(num3+ " is the biggest one");
      }
      System.out.println("__________________");
      if (num1>=num2 && num1>=num3){
          System.out.println(num1+ " is the biggest one");
      } else if (num2>=num1 && num2>=num3) {
          System.out.println(num2+ " is the biggest one");
      } else{
          System.out.println(num3+ " is the biggest one");
      }
  }


}
