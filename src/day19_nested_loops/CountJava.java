package day19_nested_loops;

public class CountJava {
    public static void main(String[] args) {
/*
        java is a language java


         * This is the another way to count words in String
         * This time we used fori loop and some string methods
         * Made by: @yourName
         */
        String str = "java is a language java";
        int counter = 0;

        for (int i = 0; i < str.length()-3 ; i++) {
            String everyFour = str.substring(i, i+4);
            if (everyFour.equals("java")){
                counter++;

            }
        }
        System.out.println(counter);



    }
}
