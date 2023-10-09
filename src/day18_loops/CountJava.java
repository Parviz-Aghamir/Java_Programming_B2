package day18_loops;

public class CountJava {
    public static void main(String[] args) {

        String str = "java is java language.java";
        int count =0;

        while (str.contains("java")){
            str =str.replaceFirst("java", "*");
            count ++;
            System.out.println(str);
        }
        System.out.println(count);
        System.out.println(str);


    }

}
