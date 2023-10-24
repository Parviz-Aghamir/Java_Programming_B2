package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    /*
    Ask a user: How many elements do you want to have in an array?
    I need to make an array with that size
    Now ask a user to enter the values for each element
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many elements do you want to have in an array? ");
        int size = input.nextInt();
        //int count = 0;

        int[] arr = new int[size]; // I made a new array with size that user gave

        /*
      do {
          System.out.print("enter the values for each element: ");
          arr[count] = input.nextInt();
          count++;
      }while (count < size);
        System.out.println(Arrays.toString(arr));

         */
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Value for index of " + i + ": ");
            arr[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // Add one more element which is 100 to the elements that user gave

        int[] arr2 = Arrays.copyOf(arr, arr.length+1);
        arr2[arr2.length-1] = 100;

        System.out.println("New arr with addition: " + Arrays.toString(arr2));


        // TODO: 25/10/2023   // Do not add only 100 - ask a user how many new numbers they want to add: 5
        //        //      int newAdd = input.nextInt();
        //        // Make new array with that size
        //        //       int [] arr3 = Arrays.copyOf(arr, arr.length+newAdd);
        //        // ask user to enter new values for those added indexes



    }
}
