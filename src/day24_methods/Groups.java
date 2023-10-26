package day24_methods;

import java.sql.Array;
import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] groups = new String[4][];
        //String [][] groups2 = new String[4][3];
        //[       [null, null, null], [null, null, null], [null, null, null], [null, null, null]      ]

        System.out.println(Arrays.deepToString(groups));


        System.out.println("***********");

        String [] group1 = {"Guler", "Maya", "Parvana"};
        groups[0] = group1;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 2 .......");

        String [] group2 = {"Iryna", "Aytaj", "Elturk", "Anna"};
        groups [1] = group2;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 3 .......");

        String [] group3 = {"Ramiz", "Natalia"};
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));

        String [] group4 = {"Ulvi"};
        groups[3] = group4;

        System.out.println(Arrays.deepToString(groups));


        System.out.println("**********************");


        for (String[]  eachElem: groups
             ) {
            System.out.println(Arrays.toString(eachElem));

        }

        System.out.println("**********************");

        for (String[]  eachArray: groups ) {                    // OUTER LOOP: cycles through 2D array, get each array

            System.out.println(Arrays.toString(eachArray));

            for (String eachName : eachArray   ) {             // INNER LOOP: cycles through each array, get each value
                System.out.println(eachName);
            }

        }










//         With Traditional Loop / Fori
//        for (int i = 0; i < groups.length; i++) {
//            System.out.println(Arrays.toString( groups[i] ) );
//        }





















    }
}
