package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.println("i "+i);


            if (i==3){
                break;
            }
            for (int j = 0; j < 2; j++) {
                System.out.println("j "+j);
                break;// Once the break statement is reached it end the LOOP which is have that break statement directly inside itself

            }
        }



    }

}
