package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {


        String [] studentOne = {"001", "Tom", "Jerry", "Batch#2"};
        System.out.println(Arrays.toString(studentOne));
        System.out.println();

        String [] studentTwo = new String[4];
        System.out.println(Arrays.toString(studentTwo));
        System.out.println();
        studentTwo[0]= "002";
        studentTwo[1] = "Mickey";
        studentTwo [2]= "Mouse";
        studentTwo [3] = "Batch#2";
        System.out.println(Arrays.toString(studentTwo));
        Scanner input =new Scanner(System.in);
        String [] studentThree = new String[4];
        System.out.print("Enter ID: ");
        studentThree[0] = input.next();
        System.out.print("Name: ");
        studentThree[1] = input.next();
        System.out.print("Last Name: ");
        studentThree[2] = input.next();
        System.out.print("batch#: ");
        studentThree[3] = input.next();
        System.out.println(Arrays.toString(studentThree));

        System.out.println();
        String [] studentFour = new String[4];

        String[] question = {"Enter ID: ", "Name: ", "Last Name: ","batch#: "};
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            studentFour[i]= input.next();

        }
        System.out.println(Arrays.toString(studentFour));









    }


}
