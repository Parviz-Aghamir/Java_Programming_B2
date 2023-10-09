package day18_loops;

import java.util.Scanner;

/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */
public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String userSentence = input.nextLine().trim();
        int countEmpty=0;
        for (int i = 0; i < userSentence.length(); i++) {
            if (userSentence.charAt(i) == ' '){
                countEmpty++;
            }
           // System.out.println(userSentence.charAt(i));


        }
        System.out.println(countEmpty);
        System.out.println("You have "+ (countEmpty+1)+ " words");




    }

}
