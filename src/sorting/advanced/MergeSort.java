/* 
QUESTION:
Given an array of integers, nums,sort the array in non-decreasing order using the merge sort algorithm. 
Return the sorted array.

MERGE SORT (Think: “Divide and conquer”):
* Split the array into two halves.
* Keep splitting each half until you get arrays of 1 element.
* Then, merge two sorted halves while keeping them sorted.
* Keep merging upward until the full array is merged and sorted.
Goal: Break down the problem, solve small parts, and combine them in sorted order.

[4, 2, 7, 1]
[4, 2], [7, 1]
[4], [2], [7], [1]
[2, 4], [1, 7]
[1, 2, 4, 7]


Examples:
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]


Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


//CODE: 
package sorting.advanced;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {7, 4, 1, 5, 3};
        int[] arr2 = {5, 4, 4, 1, 1};

        printArray(mergeSort(arr1));
        printArray(mergeSort(arr2));
    }

    public static int[] mergeSort(int[] nums) {
        if (nums.length <= 1) return nums;

        int mid = nums.length / 2;

        int[] left = new int[mid];
        for (int i = 0; i < mid; i++)
            left[i] = nums[i];

        int[] right = new int[nums.length - mid];
        for (int i = mid; i < nums.length; i++)
            right[i - mid] = nums[i];

        left = mergeSort(left);
        right = mergeSort(right);

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }

        while (i < left.length)
            nums[k++] = left[i++];

        while (j < right.length)
            nums[k++] = right[j++];

        return nums;
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