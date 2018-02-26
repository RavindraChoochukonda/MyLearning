package com.pursuit.sorting;

public class BubbleSort {
    public void sort(int[] a) {
        int size = a.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }
    /*
    Simplest sorting algorithm.
    Works by repeatedly swapping the adjacent elements if they are in wrong order
    On each pass, maximum/minimum element is "bubbled" out depending on the order of sort
    This algo always runs O(n^2) even if the array is already sorted.
    Whole pass without any swap is needed for the algo to know that the array is sorted. Flag can be used for optimization.

    Time Complexity: O(n^2)

    Worst case: reverse sorted array
    Best Case : Array is already sorted O(n)

    Sorting in place, Stable
     */
}
