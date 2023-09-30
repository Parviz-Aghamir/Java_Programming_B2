package day13_string;

public class StringMemory {
    public static void main(String[] args) {
        int num =4;
        byte num2 =5;
        char letter= 'f';
        boolean result = true;
        double num3 = 34.5;
        String str = "Hello";
        String str2 = new String ("Hello");


        String zero = "Java";
        String first = "java";                           // String literal  -------> Stored Heap String Pool
        String second = new String("java");       // String object ()String by new keyword ------> Stored Directly in pool
        String third = "java";
        String fourth = new String("java");
        System.out.println(first == second);
        System.out.println(first==third);
        System.out.println(second==fourth);
        System.out.println(zero==first);
                                                        // == (relational operator)  with String compares the memory location


    }




}
