package day06_a_arithmetic_operators;

public class TypeCasting {

    public static void main (String[] args){

    byte num1 = 40;
    int i1 = num1;


    int i2=100;
    byte b2= (byte) i2;


        System.out.println(num1);
        System.out.println(b2);
    int i3=500;
    long l1= i3;

        System.out.println(l1);
        long l2 = 200l;
        int i4= (int)l2;
        System.out.println(i4);
        double d =50;
        System.out.println(d);
        int i5 = (int)d;
        double d1= 40;
        byte b3= (byte) d1;
        System.out.println();

        int i6 = 200;
        byte b4 = (byte) i6; // data lost
        System.out.println(i6);
        System.out.println(b4);
        System.out.println();

        double d3 = 45.56;
        int i7 = (int) d3;
        System.out.println(d3);
        System.out.println(i7);









    }

}
