package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String[] arr = {"java", "api","selenium","dabase"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("===============");

        String[] arr2 = {"java", "api","Selenium","12","dabase","$%", "Apple","aPI", " ","34"};
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));







    }
}
