package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "loopcamp";
        //            0123
        System.out.println(str.charAt(0)); //l
        System.out.println(str.charAt(1)); //o
        System.out.println(str.charAt(2)); //o
        System.out.println(str.charAt(3)); //p

        System.out.println("Lets do it with the loop");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }







    }
}
