package day21_arrays;

public class AverageNumbers {
    /*
        Average Number from Array
        Given an int array calculate the average number -> Make it flexible so it will work with any array size
        Examples:
        [1,2,3] -> average: 2
        [10, 15, 5, 6] -> average: 9
        [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
 */
    public static void main(String[] args) {
        int[] arr = {2,4,6,12,45,67,87,23,34,87,34};
        int sum = 0;
        for (int each : arr){
            sum += each;
        }
        System.out.println("Sum: " +sum);
        System.out.println("Avarge: " +sum/arr.length);
        System.out.println("****************************");
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 +=arr[i];
        }
        System.out.println("Sum: "+sum2);
        System.out.println("Avarge: " +sum2/arr.length);





    }

}
