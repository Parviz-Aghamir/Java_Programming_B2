package day18_loops;

import java.util.Scanner;

/*
       input: 2juMp41EEkd4s4

       output
            3 uppercase
            6 lowercase
            5 numbers

 */
public class CountChars {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        String str = "2juMp41EEkd4s4";
        int countUpper = 0;
        int countLower = 0 ;
        int countNumber = 0;
        int countSpecial = 0;
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if (eachLetter>= 'A' && eachLetter<='Z'){
                countUpper ++;
            } else if (eachLetter>='a' && eachLetter<='z') {
                countLower++;
            }else if (eachLetter>='0' && eachLetter<='9'){
                countNumber++;
            }
        }
        System.out.println("Uppercase: "+countUpper);
        System.out.println("Lowercase: "+countLower);
        System.out.println("Number: "+countNumber);
        System.out.println("**************************");

        // Here we used Character class which has some reusable methods to check if it is UPPER case or LOWER case or DIGIT
        // Also, we did not declare new variables to count it, so, that is why on the print out, it shows doubled.
        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i); // get the character at the index number i

            //if character is uppercase -- eachLetter >= 'A' && eachLetter <= 'Z'
            if (Character.isUpperCase(str.charAt(i))){
                countUpper++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLower++;
            } else if (Character.isDigit(str.charAt(i))) {
                countNumber++;
            } else {
                countSpecial++;
            }

        }

        System.out.println("Uppercase character count: " + countUpper);
        System.out.println("Lowercase character count: " + countLower);
        System.out.println("Number character count: " + countNumber);
        System.out.println("Special character count: " + countSpecial);

    }
}
