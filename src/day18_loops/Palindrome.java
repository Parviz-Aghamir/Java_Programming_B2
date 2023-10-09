package day18_loops;

public class Palindrome {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";
        for (int i = original.length()-1; i >=0 ; i--) {
            reversed += original.charAt(i);

        }
        System.out.println(original.equals(reversed) ? "It is palindrome" : "Is not Palindrome" );
        System.out.println("****************************");

        if (original.equals(reversed)) {
            System.out.println("It is palindrome");
        }else {
            System.out.println("Is not Palindrome");
        }
       // System.out.println(reversed);

    }


}
