package day03_comments_escape_sequence;

public class Quote {
    public static void main(String[] args) {
        /*
        How can I output the flowing
        I like "Java" programing
         */
        System.out.println("I like \"Java\" programing");
        /*
        How can I output the flowing
        I like \Java\ programing
         */
        System.out.println("I like\\Java\\");

       // How can I output the flowing
        //I like \\Java\\ programing
        System.out.println("I like \\\\Java\\\\");

    }
}
