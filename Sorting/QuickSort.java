package com.pursuit.sorting;

public class QuickSort {
    public void sort(int[] a, int l, int r) {

        if (l < r) {
            int pi = partition(a, l, r);

            sort(a, l, pi - 1);
            sort(a, pi + 1, r);
        }


    }
    /*
    The key process in quickSort is partition().
    Target of partitions is, given an array and an element x of array as pivot,
    put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and
    put all greater elements (greater than x) after x.
    All this should be done in linear time.
     */

    public int partition(int[] a, int l, int r) {
        int pivot = a[r];
        int low = l - 1;

        for (int i = l; i <= r; i++) {
            if (a[i] <= pivot) {
                low++;

                int temp = a[i];
                a[i] = a[low];
                a[low] = temp;
            }
        }
        System.out.println(low);

        a[low] = pivot;


        return low;

    }

    /*
    Divide and Conquer
    It picks an element as pivot and partitions the given array around the picked pivot :

    different versions:
    Always pick first element as pivot.
    Always pick last element as pivot (implemented below)
    Pick a random element as pivot.
    Pick median as pivot.

    Worst Case: The worst case occurs when the partition process always picks greatest or smallest element as pivot.
                O(n^2)
    Best Case: The best case occurs when the partition process always picks the middle element as pivot.
                O(nLogn)
    Average case : O(nLogn)

    Quick Sort is preferred over MergeSort for sorting Arrays:
    Quick Sort in its general form is an in-place sort (i.e. it doesn’t require any extra storage)
    whereas merge sort requires O(N) extra storage, N denoting the array size which may be quite expensive
     */
}
