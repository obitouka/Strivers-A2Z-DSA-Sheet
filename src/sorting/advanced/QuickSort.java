/*
QUESTION:
Given an array of integers called nums, sort the array in non-decreasing order using the quick sort algorithm and
return the sorted array.

QUICK SORT (Think: “Pick a pivot, put smaller on left, bigger on right”):
* Pick a pivot element from the array.
* Rearrange the array so that:
    - All elements smaller than pivot go to the left.
    - All elements greater than pivot go to the right.
* Recursively apply the same steps to left and right subarrays.
* Eventually, each subarray becomes sorted.
Goal: Use a pivot to divide the problem and conquer both sides recursively.

[9, 3, 7, 1]
[3, 7, 1] [9]
[3, 1] [7] [9]
[1, 3] [7] [9]
[1, 3, 7, 9]

Examples:
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]

Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


//CODE:
package sorting.advanced;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr1 = {7, 4, 1, 5, 3};
        int[] arr2 = {5, 4, 4, 1, 1};

        printArray(arr1);
        printArray(arr2);
    }



    public static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}

/*
OUTPUT:

*/
