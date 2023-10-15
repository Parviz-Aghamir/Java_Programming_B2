package day21_arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[] nums = {23, 13, 65, 786, 9653, 23, 67, 7886};
        int min =nums[0];
        int max= nums[0];
        for (int i = 0; i < nums.length; i++) {
            int eachElement = nums[i];
            if (eachElement<min){
                min = eachElement;
            }
            if (eachElement>max){
                max =eachElement;
            }
            }

        System.out.println(min);
        System.out.println(max);

    }

}
