package com.petrusandrey;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr [] = {10, 15, 13, 20, 22, 35, 39, 45};
        Arrays.sort(arr);

        int key = 13;
        int res = Arrays.binarySearch(arr, key);
        if (res >= 0) {
            System.out.println(key + " found at index = " + res);
    } else {
            System.out.println(key + " Not found ");
        }

        key = 40;
        res = Arrays.binarySearch(arr, key);
        if (res >= 0) {
            System.out.println(key + " found at index = " + res);
        } else {
            System.out.println(key + " Not found ");
        }
    }
}
