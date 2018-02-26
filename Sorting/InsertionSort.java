package com.pursuit.sorting;

public class InsertionSort {
    public void sort(int[] a) {
        int size = a.length;

        for (int i = 1; i < size; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
    /*
    Start from index i, pick the element and iterate backwards to move any element which is greater than the key.
    Once an element less than key is encountered at j, j+1 is the position of key in sorted array from left so far.

    Time complexity: O(n^2)

    Auxiliary space : O(1)
    Worst case: reverse sorted array
    Best Case : Array is already sorted O(n)

    Sorting In Place: Yes

Stable: Yes

Online: Yes -- > Stream of numbers input

Uses: Insertion sort is used when number of elements is small.
It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
     */
}
