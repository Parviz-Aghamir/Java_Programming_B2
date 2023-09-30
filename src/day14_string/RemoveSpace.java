package day14_string;

public class RemoveSpace {

    public static void main(String[] args) {

String s = "     Thursday      ";
        System.out.println(s);
        System.out.println(s.length());

        System.out.println(s.trim());
        System.out.println((s.trim().length()));
        s=s.trim();
        System.out.println(s.length());
        System.out.println("______________");
        System.out.println(s.startsWith("Th"));
        String str = "       java is fun     ";
        System.out.println(str.endsWith("  fun"));
        str.trim();
        System.out.println(str.endsWith("  fun"));
        str=str.trim();
        System.out.println(str.endsWith("  fun"));



    }

}
