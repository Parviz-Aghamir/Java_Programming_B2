package day14_string;

import java.util.Locale;

public class UpperAndLower {
    public static void main(String[] args) {
        String str = "LooPCamP";

        System.out.println(str);
        System.out.println("______________");

        System.out.println(str.toLowerCase());
        System.out.println("______________");

        str = str.toLowerCase();
        System.out.println(str);
        System.out.println("______________");
        str = "LooPCamP";

        System.out.println(str.toUpperCase());
        System.out.println("______________");


        System.out.println(str);
        System.out.println("______________");


        str = str.toUpperCase();
        System.out.println(str);



        System.out.println("______________");
        String word = "HELLO";
        String word2 = word+ " WORLD";
        System.out.println(word2);
        System.out.println(word);
        System.out.println("______________");

        System.out.println(word.toUpperCase());

        System.out.println(word2.toLowerCase());
        System.out.println(word.toLowerCase());

        System.out.println("______________");
        System.out.println(word2);
        System.out.println(word);

        System.out.println("______________");

        word2+= " Next Line";
        System.out.println(word2);
        System.out.println("______________");
        word2 = word2.toLowerCase();
        System.out.println(word2);




    }


}
