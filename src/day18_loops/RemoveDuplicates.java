package day18_loops;
/*
intput; abcabcd;
output ; abcd;
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        String orginal = "abcabcd";
        String unique = "";
        for (int i = 0; i < orginal.length(); i++) {
            if (!unique.contains(""+orginal.charAt(i))){
                unique += orginal.charAt(i);
            }
        }
        System.out.println(unique );




    }

}
