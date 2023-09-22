package day08_scanner_logical_operators;

public class GoForWalk {
    /*
    Task: Want to go for a walk

            if it is not raining
            if temp is above 70

     */
    public static void main(String[] args) {
        boolean isRainig = false;
        int temp = 17;


        System.out.println("Do I need to go for a walk " +(!isRainig && temp > 20));
    }

}
