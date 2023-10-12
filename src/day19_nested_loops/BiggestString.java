package day19_nested_loops;
/*
    Biggest substring of matching characters
    Given a String find the biggest substring of chars that match and print it.
    Ex: aaabbbcccccddddee Output: ccccc
 */
public class BiggestString {
    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";
        String sub = "";
        String biggest ="";


        for (int i = 0; i <str.length()-1 ; i++) {
            sub += str.charAt(i);
            if (str.charAt(i) != str.charAt(i+1)){
                if (biggest.length()<sub.length()){
                    biggest = sub;
                }
                sub = "";

            }

        }
        System.out.println(biggest);




    }

}
