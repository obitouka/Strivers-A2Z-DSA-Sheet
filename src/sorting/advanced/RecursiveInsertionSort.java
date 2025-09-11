/* 
Given an array of integers nums, sort the array in non-decreasing order using the recursive Insertion Sort algorithm, 
and return the sorted array. You must implement Insertion Sort using recursion only.
Do not use loops (like for or while) or built-in sorting functions (sort, Arrays.sort, etc.).


RECURSIVE INSERTION SORT:
* Check if size is 1 — if yes, it’s sorted.
* Recursively sort the first (n-1) elements.
* Insert the last element (nth) at its correct position in the sorted part.
Goal: Use insertion sort idea, but sort the initial part recursively.

[6, 4, 2, 5]
[4, 6, 2, 5]
[2, 4, 6, 5]
[2, 4, 5, 6]


Examples:
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]

Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


//CODE:
package sorting.advanced;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {7, 4, 1, 5, 3};
        int[] arr2 = {5, 4, 4, 1, 1};

        insertionSort(arr1, 0, arr1.length);
        insertionSort(arr2, 0, arr2.length);

        printArray(arr1);
        printArray(arr2);
    }

    public static void insertionSort(int[] arr, int i, int n) {
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertionSort(arr, i + 1, n);
    }

    public static void printArray(int[] arr){
        for(int x: arr)
            System.out.print(x+" ");
        System.out.println();
    }
}

/*
OUTPUT:
1 3 4 5 7
1 1 4 4 5
*/
