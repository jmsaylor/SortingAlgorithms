package com.johnmsaylor;

import com.johnmsaylor.quicksort.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] arrInt = { 3, 9, 7, 4, 1, 6, 2, 8, 5};
//        Arrays.stream(QuickSort.quicksort(arrInt, 0, arrInt.length - 1)).forEach(x -> System.out.print(x + " "));
        char[] arr = {'z', 'c', 'f', 'a', 'b', 'g', 'h'};
        System.out.println(QuickSort.quicksort(arr, 0, 6));
    }
}
