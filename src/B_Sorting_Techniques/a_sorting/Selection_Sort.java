/*
Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and return the sorted array.
A sorted array in non-decreasing order is an array where each element is greater than or equal to all previous elements in the array.


Examples:
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]

Input: nums = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


/* 
SELECTION SORT (Think: “Pick the smallest, put it in place”): 

* Start from the beginning of the list.
* Find the smallest number in the remaining unsorted part.
* Swap it with the current position.
* Move to the next position and repeat the process.
* Continue until the entire list is sorted.

Goal: Place the smallest numbers at the front one by one.
*/


//CODE:
package StriverDSA.B_Sorting_Techniques.a_sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr1[] = {7, 4, 1, 5, 3};
        int arr2[] = {5, 4, 4, 1, 1};

        printArray(selectionSort(arr1));       
        printArray(selectionSort(arr2));
    }

    public static int[] selectionSort(int[] arr) {
        // Loop through each position in the array
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // Assume current index has the smallest value

            // Look for a smaller value in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Found new smallest, update index
                }
            }

            // Swap current element with the smallest one found
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
