package day08_scanner_logical_operators;

public class ShortCircuit {
    /*
    &&
    --------------------
    true && true ---> True
    true && false ---> False
    False && true ---> False
    False && False ---> False
     int a = 10;
        System.out.println(false& (a++>11));

        ||
    --------------------
    true && true ---> True
    true && false ---> True
    False && true ---> True
    False && False ---> False
         */
    public static void main(String[] args) {
        System.out.println(true || 5/0 == 0);
        System.out.println(false && 5/0==0);
        System.out.println(false & 5/1==5);
    }
}
