package day05_variable;

 /*
            create a class MyName
            create a main method
            create multiple char variables, one for each letter of your name
            print your name
                print each letter in a different line
                print your name in the same line
     */

public class MyName {

    public static void main(String[] args) {
        char first = 'P';
        char second = 'a';
        char three = 'r';
        char four = 'v';
        char five = 'i';
        char six = 'z';
        System.out.println(first);
        System.out.println(second);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(first+second+three+four+five+six);
        System.out.println("My name is "+first+second+three+four+five+six);
        String myName= ""+first+second+three+four+five+six;
        System.out.println(myName);


    }

}
