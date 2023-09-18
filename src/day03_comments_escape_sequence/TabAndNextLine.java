package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {

        System.out.println("This is not tabed");
        System.out.println("    This is 1 time tabed");
        System.out.println("    This is 1 time tabed"); // 4 space
        System.out.println("\t This is 1 time tabed");
        System.out.println();
        // The followings are about \n - new line
        System.out.println("1) Go to store");
        System.out.println("2) grab milk");
        System.out.println("3) pay cashier\n");
        System.out.println("\n1) Go to store\n2) grab milk\n3) pay cashier ");


    }
}
