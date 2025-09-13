/*
QUESTION:
Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.
This must be done in place, without making a copy of the array.


Examples:
Input: nums = [0, 1, 4, 0, 5, 2]
Output: [1, 4, 5, 2, 0, 0]

Input: nums = [0, 0, 0, 1, 3, -2]
Output: [1, 3, -2, 0, 0, 0]
*/


//CODE:
package arrays.easy;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 4, 0, 5, 2};
        int[] arr2 = {0, 0, 0, 1, 3, -2};
        printArray(moveZeroes(arr1));
        printArray(moveZeroes(arr2));
    }

    public static int[] moveZeroes(int[] arr) {
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if(j == -1) return arr;

        for (int i = j+1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;

        /* BRUTE FORCE METHOD
        int[] temp = new int[arr.length];
        int index = 0;
        for (int x : arr) {
            if (x != 0) {
                temp[index++] = x;
            }
        }

        // Fill the rest with 7
        while (index < arr.length) {
            temp[index++] = 0;
        }

        printArray(arr);
         */
    }

    public static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}

/*
OUTPUT:
1 4 5 2 0 0
1 3 -2 0 0 0
*/
