package day21_arrays;

public class ForEachExample {
    public static void main(String[] args) {
        
        int [] nums = {30, 12, 150, 12};

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional forI loop: "+nums[i]);
        }
        System.out.println("****************************");
        
        for (int each: nums){
            System.out.println("ForEach loop: "+each);
            if (each==12){
                break;
            }

        }
        for (int i = 0; i < nums.length; i++) {

            if (i== 2){
                nums[i] = 34;
            }

        }

        System.out.println("****************************");

        String [] classes = {"java", "Soft skills", "api", "db", "selenium"};
        for (String each: classes) {

            System.out.println("For each loop: " + each);
        }
        System.out.println("****************************");

        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);

        }
        System.out.println("****************************");

        double [] prices = {2.3, 45.7, 34, 21.2};
        for (double each: prices){
            System.out.println(each);
        }


        
    }
    
    
}
