package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i =5;
        int z = i++;
        System.out.println(z);
        System.out.println(i);
        System.out.println();


        int a = 10;
        int b = a+1;
        System.out.println(a); //10
        System.out.println(b); // 11
        System.out.println();



        int c = ++a;
        System.out.println(c); //11
        System.out.println(a); //11




    }


}
