package day21_arrays;

import java.util.*;


public class SelectMonth {

    public static void main(String[] args) {
        String [] months ={"January", "February", "March", "April", "May", "June",
                           "July", "Avgust", "September","October", "November", "December"};
        System.out.println(months.length);
        System.out.println(Arrays.toString(months));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number that represents the month: ");
        int userNum = input.nextInt();


        if (userNum>0 && userNum<=12){
            System.out.println(months[userNum-1]);
        }else{
            System.out.println("Sorry, invalid number.");
        }





    }
}
