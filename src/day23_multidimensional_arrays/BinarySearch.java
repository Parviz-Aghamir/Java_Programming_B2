package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


        //(It works when all elements are SORTED)
        int [] num = {4, 10, 30, 20, 100};
        // For this .binarySearch method to work -- > all elements have to SORTED

        System.out.println(Arrays.binarySearch(num, 4));
        System.out.println(Arrays.binarySearch(num, 10));
        System.out.println(Arrays.binarySearch(num, 100));
        System.out.println(Arrays.binarySearch(num, 20));
        System.out.println(Arrays.binarySearch(num, 200)); // would be in p0sition 4, so 4 + 1 = 5 and negative because it is not in array, so -5













    }
}
