package day20_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "AABXXDEEF"; //AXE
        String str2 = "AABXXDEEF";
        // if the character is in the String 2 or more times.
        String duplicate = "";

        for (int i = 0; i < str.length(); i++) {
            char eachOuterLetter = str.charAt(i);
            int count =0;

            if (duplicate.contains(""+eachOuterLetter))
                continue;


            for (int j = 0; j < str2.length(); j++) {
                char eachInnerLetter = str2.charAt(j);
                if (eachInnerLetter==eachOuterLetter){
                    count++;
                }
            }
            if (count>1){
                duplicate = duplicate+eachOuterLetter;
            }

        }

    }




}
