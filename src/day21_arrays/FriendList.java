package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many friends do you have: ");
        int numOfFriends = input.nextInt();

        String [] friendNameList = new String[numOfFriends];
        for (int i = 0; i <numOfFriends; i++) {
            System.out.print("Enter your friends name "+(i+1)+": " );

            friendNameList[i] =input.next();



        }
        System.out.println(Arrays.toString(friendNameList));


    }


}
