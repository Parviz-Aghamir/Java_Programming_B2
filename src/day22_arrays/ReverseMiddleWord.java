package day22_arrays;

import java.util.Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        String str = "Java always fun";
        String [] words = str.split(" ");
        String midReverse = "";
        int middle = words.length/2;

        for (int i = words[middle].length()-1; i >=0 ; i--) {
            midReverse+=words[middle].charAt(i);


        }
        System.out.println(midReverse);
        words[middle]= midReverse;
        System.out.println(Arrays.toString(words));

    }
}
