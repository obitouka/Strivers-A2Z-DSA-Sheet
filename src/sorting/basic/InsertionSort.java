/* 
Given an array of integers called arr, sort the array in non-decreasing order using the insertion sort algorithm 
and return the sorted array. 

INSERTION SORT (Think: “Like sorting cards in hand”):
* Start from the second number (index 1).
* Compare it with the numbers before it.
* Shift larger numbers to the right to make space.
* Insert the current number in its correct sorted position.
* Repeat for each number until the list is sorted.
Goal: Build a sorted list by inserting one element at a time.

[8, 3, 5, 2]
[3, 8, 5, 2]
[3, 5, 8, 2]
[2, 3, 5, 8]


Examples:
Input: arr = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]

Input: arr = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


//CODE:
package sorting.basic;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {7, 4, 1, 5, 3};
        int[] arr2 = {5, 4, 4, 1, 1};

        printArray(insertionSort(arr1));
        printArray(insertionSort(arr2));
    }

    public static int[] insertionSort(int[] arr) {
        for (int right = 1; right < arr.length; right ++) {
            int current = arr[right];
            int left  = right - 1;

            while (left  >= 0 && current < arr[left]) {
                arr[left  + 1] = arr[left];
                left--;
            }

            arr[left  + 1] = current;
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