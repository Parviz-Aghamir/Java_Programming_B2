package day14_string;

import java.util.SortedMap;

public class StartsAndEnds {
    public static void main(String[] args) {
        String str ="Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String str2= "App";
        System.out.println(str.startsWith(str2));

        System.out.println("____________" );
        System.out.println(str.startsWith(" App"));
        System.out.println(str.startsWith(  "App"));
        System.out.println("____________" );

        String sentence = "It is a good day";

        System.out.println(sentence.startsWith(" a good day"));
        System.out.println(sentence.endsWith(" a good day"));
        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith("It is a good day"));
    }


}
