package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main (String[] args){
        System.out.println(10+5);
        System.out.println(10*5);
        System.out.println(10.0/5);
        System.out.println(10.0/5.0);
        System.out.println();
        System.out.println(10.0/5.0);
        System.out.println((int)10.0/5);
        System.out.println((double) 10/5);
        System.out.println();



        byte b1 = 10;
        byte b2 = 20;
        //byte sum = b1+b2 // this will not work because the values get change to int during the calculation
        int sum = b1+b2;
        byte sumbyte= (byte)(b1+b2);
        System.out.println(sum);
        System.out.println(sumbyte);





    }




}
