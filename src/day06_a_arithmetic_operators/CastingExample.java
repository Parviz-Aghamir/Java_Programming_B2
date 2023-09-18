package day06_a_arithmetic_operators;

public class CastingExample {


    public static void main (String[] args){
        short numOne= 40;
        float numTwo = numOne;
        System.out.println(numOne);
        System.out.println(numTwo);

        System.out.println();

        float num3= 100.5F;
        short num4= (short) num3;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println();


        float num5= 300;
        byte num6=(byte)num5;
        short num7= (short)  num5;
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);






    }
}
