package day20_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AABXXDEEF";
        String uniques = "";

        for (int i = 0; i < str.length(); i++) {
            char eachOuterLetter = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char eachInnerLetter = str.charAt(j);
                if (eachOuterLetter == eachInnerLetter){
                    count++;
                }
            }
            if (count==1){
                uniques += (""+eachOuterLetter);
            }
        }
        System.out.println(uniques);
    }
}
