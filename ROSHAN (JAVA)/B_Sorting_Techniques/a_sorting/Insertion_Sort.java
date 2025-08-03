/* 
Given an array of integers called arr, sort the array in non-decreasing order 
using the insertion sort algorithm and return the sorted array. A sorted array in non-decreasing order is an array 
where each element is greater than or equal to all preceding elements in the array.


Examples:
Input: arr = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]

Input: arr = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


//CODE:
package StriverDSA.B_Sorting_Techniques.a_sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr1[] = {7, 4, 1, 5, 3};
        int arr2[] = {5, 4, 4, 1, 1};

        printArray(insertionSort(arr1));
        printArray(insertionSort(arr2));
    }

    public static int[] insertionSort(int[] arr) {
        // Start from index 1 because the element at index 0 is already "sorted"
        for (int i = 1; i < arr.length; i++) {
            // Store the current element that needs to be inserted into the sorted part
            int current = arr[i];

            // Start comparing from the element just before the current
            int j = i - 1;

            // Shift all elements greater than current to one position ahead
            // This creates space to insert the current element at the correct position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j]; // Move the element one step to the right
                j--; // Move to the previous element in the sorted part
            }

            // Insert the current element at its correct sorted position
            arr[j + 1] = current;
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