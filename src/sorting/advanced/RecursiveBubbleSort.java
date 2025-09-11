/*
QUESTION:
Given an array of integers nums, sort the array in non-decreasing order using the recursive Bubble Sort algorithm
and return the sorted array. You must implement Bubble Sort using recursion only.
Do not use built-in sorting functions (sort, sorted, Arrays.sort, etc.).

RECURSIVE BUBBLE SORT:
* Check if size is 1, if yes, it's sorted.
* Do one pass of bubble sort: compare and swap adjacent elements if needed.
* After one pass, the largest is at the end.
* Call the function again for the rest (n-1 elements).
Goal: Use bubble sort logic, but do it using recursion instead of loops.

[3, 2, 1, 4]
[2, 1, 3, 4]
[1, 2, 3, 4]
[1, 2, 3, 4]


Examples:
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]

Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


//CODE: 
package sorting.advanced;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr1 = {7, 4, 1, 5, 3};
        int[] arr2 = {5, 4, 4, 1, 1};

        bubbleSort(arr1, arr1.length);
        bubbleSort(arr2, arr2.length);

        printArray(arr1);
        printArray(arr2);
    }

    public static void bubbleSort(int[] arr, int n) {
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n - 1);
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

