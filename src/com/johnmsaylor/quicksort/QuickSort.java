package com.johnmsaylor.quicksort;

public class QuickSort {

    public static char[] quicksort(char[] items, int left, int right) {
        int i, j;
        char x, y;

        i = left; j =right;
        x = items[(left + right)/2];

        do {
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;

            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while (i <= j);

//        System.out.println(items);

        if (left < j) {
            return quicksort(items, left, j);
        }
        if (i < right) {
            return quicksort(items, i, right);
        }
        return items;
    }

    public static int[] quicksort(int[] items, int left, int right) {
        //for some reason not sorting the right side 
        int i, j;
        int pivot, temp;

        i = left; j = right;
        pivot = items[(left + right)/2];

        do {
            while((items[i] < pivot) && (i < right)) i++;
            while((pivot < items[j]) && (j > left)) j--;

            if (i <= j) {
                temp = items[i];
                items[i] = items[j];
                items[j] = temp;
                i++;j--;
            }
        } while (i <= j);


        if (left < j) {
            return quicksort(items, left, j);
        }
        if (i < right) {
            return quicksort(items, i, right);
        }

        return items;


    }
}
