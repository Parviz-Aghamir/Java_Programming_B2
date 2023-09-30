package day10_if_statements;

public class IfWithoutBrackets {
    public static void main(String[] args) {
        //Single if statement with brackets --->which has 1 statement.
        if (4>2){
            System.out.println("Hello");
        }

        // Single if statement with brackets ---> which has 2 statement
        if (4>2){
            System.out.println("hello");
            System.out.println("bye");
    }
        // Single if statement without brackets --->  which has 1 statement.
        if (5<1)
            System.out.println("Hello without brackets");
            System.out.println("Another print statement"); // this one has nothing to do with if statement

    }
}
