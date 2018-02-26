package com.pursuit.sorting;

public class Sorting {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        int sortThis[] = {8,7,6,5,4,3,2,1};
        bubble.sort(sortThis);
        int sortThis1[] = {8,7,6,5,4,3,2,1};
        SelectionSort selection = new SelectionSort();
        selection.sort(sortThis1);
        InsertionSort insertion = new InsertionSort();
        int sortThis2[] = {8,7,6,5,4,3,2,1};
        insertion.sort(sortThis2);
        MergeSort merge = new MergeSort();
        int sortThis3[] = {8,7,6,5,4,3,2,1};

        System.out.println("******Merge Sort*****");
        merge.sort(sortThis3,0,sortThis3.length-1);
        int sortThis4[] = {8,6,7,5,3,4,1,2};
        QuickSort quick = new QuickSort();
        quick.sort(sortThis4,0,sortThis4.length-1);

        int sortThis5[] = {8,7,6,5,4,3,2,1};
        HeapSort heap = new HeapSort();
        heap.sort(sortThis5);
        int i=0;
        while(i<sortThis5.length) System.out.print(sortThis5[i++] + ",");

    }
}
