package day06_b_unary_operators;

public class IncrementExample2 {

    public static void main (String[] args){
    int age = 20;
        System.out.println(age);
        System.out.println();

        System.out.println(age++);
        System.out.println(age);
        System.out.println();
        System.out.println(age++ +2); //23
        System.out.println(age); //22
        System.out.println();


        System.out.println(++age + 2); // 25
        System.out.println(age); //23


        System.out.println(++age + ++age + 2); // 51





    }
}
