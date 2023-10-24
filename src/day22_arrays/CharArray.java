package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] arr = {'j','a','v','a'};


        for (char eachChar: arr){
            System.out.println(eachChar);
        }

        System.out.println("===============");


        String word = "java";
        char[] newArr = new char[word.length()];



        for (int i = 0; i < word.length(); i++) {
            newArr[i]=word.charAt(i);

        }

         for (char eachChar2:
             newArr) {
            System.out.println(eachChar2);
        }



        System.out.println("===============");


        char[] charArr = word.toCharArray();

        for (char eachChar3:
                charArr) {
            System.out.println(eachChar3);
        }


        System.out.println("===============");


        System.out.println(Arrays.toString(charArr));


        System.out.println("===============");


        System.out.println(charArr[0]);

        System.out.println("===============");


        // how can we convert a char to a String

        // 1st method
        char[] day ={'w','e','d','n','e','s','d','a','y'};
        String str = new String(day);
        System.out.println(str);


        System.out.println("===============");

        //2nd method

        String str2="";
        for (int i = 0; i < day.length; i++) {
             str2 += "" +day[i];
        }
        System.out.println(str2);


        System.out.println("===============");


        //3rd method

        String str3="";
        for (char eachElement: day
             ) {
            str3+=""+ eachElement;

        }
        System.out.println(str3);
        System.out.println((""+str3.charAt(0)).toUpperCase()+str3.substring(1,str3.length()));
        System.out.println(str3.substring(0, 1).toUpperCase() + str3.substring(1,3));










    }
}
