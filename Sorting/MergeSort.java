package com.pursuit.sorting;

public class MergeSort {
    public void sort(int[] a, int left, int right) {


        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(a, left, mid);

            sort(a, mid + 1, right);

            merge(a, left, right, mid);
        }


    }

    public void merge(int[] a, int left, int right, int mid) {

        int mSize = mid - left + 1;
        int nSize = right - mid;
        int m[] = new int[mSize];
        int n[] = new int[nSize];
        for (int i = 0; i < mSize; i++) {
            m[i] = a[left + i];
        }
        for (int j = 0; j < nSize; j++) {
            n[j] = a[mid + j + 1];
        }
        int i = 0, j = 0, k = left;
        while (i < mSize && j < nSize) {
            if (m[i] < n[j]) {
                a[k++] = m[i++];
            } else {
                a[k++] = n[j++];
            }
        }
        while (i < mSize) {
            a[k++] = m[i++];
        }
        while (j < nSize) {
            a[k++] = m[j++];
        }

    }

    /*
    Divide and Conquer algorithm
     It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
     The merge() function is used for merging two halves.

     Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best)
     as merge sort always divides the array in two halves and take linear time to merge two halves.

     Auxiliary Space: O(n)

     Sorting In Place: No in a typical implementation

      Stable: Yes

      Merge Sort is useful for sorting linked lists in O(nLogn) time.
      No auxiliary space needed in case of LinkedList. O(1)

     */
}
