package com.pursuit.sorting;

public class HeapSort {
    public void sort(int[] a){
        int n = a.length;

        for(int i=n/2-1;i>=0;i--){
            heapify(a,n,i);
        }

        for(int i=n-1;i>0;i--){
            int swap = a[0];
            a[0] = a[i];
            a[i] = swap;

            heapify(a,i,0);
        }

    }
    //Changes in local

    public void heapify(int[] a,int n,int i){
        int max = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && a[left]>a[max]){
            max=left;
        }
        if(right<n && a[right]>a[max]){
            max = right;
        }

        if(max!=i){
            int swap = a[i];
            a[i]=a[max];
            a[max] = swap;

            heapify(a,n,max);
        }
    }
}
