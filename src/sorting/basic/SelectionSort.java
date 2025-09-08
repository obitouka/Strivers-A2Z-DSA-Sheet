/*
Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and 
return the sorted array.

SELECTION SORT (Think: Select the smallest, put it in place):
* Start from the beginning of the list.
* Find the smallest number in the remaining unsorted part.
* Swap it with the current position.
* Move to the next position and repeat the process.
* Continue until the entire list is sorted.
Goal: Place the smallest numbers at the front one by one.

[29, 10, 14, 37]
[10, 29, 14, 37]
[10, 14, 29, 37]
[10, 14, 29, 37]


Examples:
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]

Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


//CODE:
package sorting.basic;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {7, 4, 1, 5, 3};
        int[] arr2 = {5, 4, 4, 1, 1};

        printArray(selectionSort(arr1));       
        printArray(selectionSort(arr2));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}

/*
OUTPUT:
1 3 4 5 7
1 1 4 4 5
*/
