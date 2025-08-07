/* 
QUESTION:
Given an array of integers called nums,sort the array in non-decreasing order using the bubble sort algorithm 
and return the sorted array.


Examples:
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]
Explanation: 1 <= 3 <= 4 <= 5 <= 7.
Thus the array is sorted in non-decreasing order.

Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
Explanation: 1 <= 1 <= 4 <= 4 <= 5.
Thus the array is sorted in non-decreasing order.
*/


/* 
BUBBLE SORT (Think: “Big bubbles float to the top”):

* Compare two side-by-side numbers.
* If left one is bigger, swap them.
* Repeat this for the whole list.
* After 1 round, the biggest number is at the end.
* Do the same again for the rest, skipping the last sorted ones.
* Keep repeating until everything is sorted.

Goal: Push the biggest numbers to the end one by one.
*/


//CODE
package StriverDSA.B_Sorting_Techniques.a_sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr1[] = {7, 4, 1, 5, 3};
        int arr2[] = {5, 4, 4, 1, 1};
        printArray(bubbleSort(arr1));
        printArray(bubbleSort(arr2));
    }

    public static int[] bubbleSort(int[] nums) {
        //num of rounds to be sorted
        for (int i = 0; i < nums.length - 1; i++) {
            //compares adjacent elements in the unsorted part
            for (int j = 0; j < nums.length - 1 - i; j++) {
                // If left number is bigger than right, swap them
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
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