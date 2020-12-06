package com.company;

public class MergeSort {
    public static void merge(int arr[], int start, int mid, int end) {
        int n1 = mid - start + 1,
                n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; ++i) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < n2; ++i) {
            right[i] = arr[mid + i + 1];
        }
        printArray(left);
        System.out.println();
        printArray(right);
        System.out.println();

        int i = 0, j = 0;
        int originIndex = start;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[originIndex] = left[i];
                i++;
            } else {
                arr[originIndex] = right[j];
                j++;
            }
            originIndex++;
        }
        while (i < n1) {
            arr[originIndex] = left[i];
            i++;
            originIndex++;
        }
        while (j < n2) {
            arr[originIndex] = right[j];
            j++;
            originIndex++;
        }

    }

    public static void sort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void printArray(int arr[]) {
        for (int i : arr
        ) {
            System.out.print(i+" ,");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12 ,11, 13, 5, 6, 7 };

        sort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}
