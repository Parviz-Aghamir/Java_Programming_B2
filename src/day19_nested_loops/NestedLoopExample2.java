package day19_nested_loops;

public class NestedLoopExample2 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World"); // 5 times
        }
        System.out.println("Hello Universe");  // 1 time

        for (int i = 1; i <=5; i++) {
            System.out.println("Hello World"); //  5 times

        }
        System.out.println("Hello Universe"); // 1 time

        for (int i = 1; i <=5; i++) {
            System.out.println("Hello World"); // 5 times

        }
        System.out.println("Hello Universe"); // 1 time

        System.out.println("***************************");

        for (int k = 0; k < 3; k++) {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World"); // 5 times
            }
            System.out.println("Hello Universe");  // 1 time

        }



    }


}
