package com.pursuit.sorting;

public class HeapSort {
    public void sort(int[] a) {
        int n = a.length;

        //Building heap from the input
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }

        //swapping the root with the last element and reducing the size of the heap for each iteration & heapifying the root

        for (int i = n - 1; i > 0; i--) {
            int swap = a[0];
            a[0] = a[i];
            a[i] = swap;

            heapify(a, i, 0);
        }

    }

    //Heapify the node i and the following subtree

    public void heapify(int[] a, int n, int i) {
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && a[left] > a[max]) {
            max = left;
        }
        if (right < n && a[right] > a[max]) {
            max = right;
        }

        if (max != i) {
            int swap = a[i];
            a[i] = a[max];
            a[max] = swap;

            heapify(a, n, max);
        }
    }

    /*
    Heap sort is a comparison based sorting technique based on Binary Heap data structure.
    It is similar to selection sort where we first find the maximum element and place the maximum element at the end

    A complete binary tree is a binary tree in which every level,
    except possibly the last, is completely filled, and all nodes are as far left as possible

    A Binary Heap is a Complete Binary Tree where items are stored in a special order
    such that value in a parent node is greater(or smaller) than the values in its two children nodes.

    Since a Binary Heap is a Complete Binary Tree,
    it can be easily represented as array and array based representation is space efficient.

    Algo:
    1. Build a max heap from the input data.
    2. At this point, the largest item is stored at the root of the heap.
    Replace it with the last item of the heap followed by reducing the size of heap by 1. Finally, heapify the root of tree.
    3. Repeat above steps while size of heap is greater than 1.

    Time Complexity: Time complexity of heapify is O(Logn).
    Time complexity of createAndBuildHeap() is O(n) and overall time complexity of Heap Sort is O(nLogn).

    Heap sort is an in-place algorithm.
    Its typical implementation is not stable, but can be made stable

    Priority queues can be efficiently implemented using Binary Heap because it supports insert(), delete() and extractmax(), decreaseKey() operations in O(logn) time.
     */
}
