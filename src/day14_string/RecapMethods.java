package day14_string;

public class RecapMethods {
    public static void main(String[] args) {
        String s ="pen"; // s is a String literal, si it is in the String Pool
        String s2 =new String("pen");  // s2 is object in the heap, because we used 'new' keyword
        System.out.println("Compare with == " +(s==s2));
        System.out.println("Compare with equal.  " +(s.equals("pen")));




        System.out.println("Compare with equal.  " +(s.equals("Pen")));
        s="Pen";
        System.out.println("Compare with equal.  " +(s.equals("Pen")));
        String ss="Pen";
        System.out.println("Compare with equal.  " +(s.equals("Pen")));

        s="PEN";
        ss="pen";

        boolean isSame = s.equalsIgnoreCase(ss);
        System.out.println(isSame);
        System.out.println(s.equalsIgnoreCase(ss));
        if (isSame){
            System.out.println("Hello");
        }
        System.out.println("____________");
        ss= "Penn";
        isSame= s.equalsIgnoreCase(ss);
        System.out.println(isSame);
        if (s.equalsIgnoreCase(ss)){
            System.out.println("Hello");
        }else {
            System.out.println("bye");
        }
        System.out.println("---------------");

        //s--->PEN
        //SS --> PENN
        System.out.println(s.length());
        System.out.println(ss.length());

        int a = s.length();
        int b = ss.length();



        if (s.length()<4){
            System.out.println("Short");
        }else {
            System.out.println("Long");
        }
        System.out.println(a==s.length());








    }





}
