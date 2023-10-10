package day08_scanner_logical_operators;

public class OperatorPractice {

    public static void main(String[] args) {
        int w=78/2*2+3-5%5;
        System.out.println(w);
        System.out.println("-----------------");


        int a=8;
        int b = a--;
        System.out.println(a);//7
        System.out.println(b);//8
        System.out.println("-----------------");

        int l =50;
        int p = --l+l++ +l--+l++;
        System.out.println(l);
        System.out.println(p);

        System.out.println("-----------------");

        int r =20;
        int k =-r-- +r++ + --r*r--%2;//0
        System.out.println(r);
        System.out.println(k);
    }




}
