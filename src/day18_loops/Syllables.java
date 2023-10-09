package day18_loops;
/*
        Given a String separated by dashes calculate how many syllables the words are
        Ex:
        Input:
        ja-va
        Output:
        2

 */
public class Syllables {
    public static void main(String[] args) {
        String str = "ja-va-script";
        int countDash=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-'){
                countDash++;
            }
        }

        System.out.println("Syllables: " +(countDash+1));

    }

}
