package day16_loops;

public class Replace {

    public static void main(String[] args) {
        String str = "java is a language";
        String first = str.substring(0,str.indexOf(" "));
        String second = str.substring(str.indexOf(" ")+1);
        System.out.println(first);
        System.out.println(second);

        System.out.println(second + " "+ first);

    }




}
