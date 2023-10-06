package day16_loops;
/*
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.    b) If the length of the string is odd there will be one middle character.
        Ex:
        Input: elephant
        Output: The middle characters: ph
*/

public class MiddleChar {

    public static void main (String[] args){
        String str = "abcdefe";
        int mid = str.length()/2;

        if (str.length()%2==0){
            char firstMiddleChar = str.charAt(mid-1);
            char secondMiddleChar = str.charAt(mid);
            System.out.println("Middle chars: " +firstMiddleChar+secondMiddleChar);
            System.out.println("Middle chars with substring method: " +str.substring(mid-1, mid+1));

        }else {
                char middle = str.charAt(mid);
            System.out.println("Middle char: "+middle);
            System.out.println("Middle chars with substring method: " +str.substring(mid, mid+1));
        }




    }





}
