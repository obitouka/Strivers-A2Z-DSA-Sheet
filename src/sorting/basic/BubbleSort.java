/* 
QUESTION:
Given an array of integers called arr,sort the array in non-decreasing order using the bubble sort algorithm and 
return the sorted array.

BUBBLE SORT (Think: “Big bubbles float to the top”):
* Compare two side-by-side numbers.
* If left one is bigger, swap them.
* Repeat this for the whole list.
* After 1 round, the biggest number is at the end.
* Do the same again for the rest, skipping the last sorted ones.
* Keep repeating until everything is sorted.
Goal: Push the biggest numbers to the end one by one.

[5, 1, 4, 2]
[1, 4, 2, 5]
[1, 2, 4, 5]
[1, 2, 4, 5]


Examples:
Input: arr = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]

Input: arr = [5, 4, 4, 1, 1]
Output: [1, 1, 4, 4, 5]
*/


//CODE
package sorting.basic;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {7, 4, 1, 5, 3};
        int[] arr2 = {5, 4, 4, 1, 1};
        printArray(bubbleSort(arr1));
        printArray(bubbleSort(arr2));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
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