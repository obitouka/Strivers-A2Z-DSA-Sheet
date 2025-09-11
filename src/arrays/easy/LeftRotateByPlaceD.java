/* 
QUESTION:
Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.


Examples:
Input: nums = [1, 2, 3, 4, 5, 6], k = 2
Output: nums = [3, 4, 5, 6, 1, 2]
Explanation:
rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

Input: nums = [3, 4, 1, 5, 3, -5], k = 8
Output: nums = [1, 5, 3, -5, 3, 4]
Explanation:
rotate 1 step to the left: [4, 1, 5, 3, -5, 3]
rotate 2 steps to the left: [1, 5, 3, -5, 3, 4]
rotate 3 steps to the left: [5, 3, -5, 3, 4, 1]
rotate 4 steps to the left: [3, -5, 3, 4, 1, 5]
rotate 5 steps to the left: [-5, 3, 4, 1, 5, 3]
rotate 6 steps to the left: [3, 4, 1, 5, 3, -5]
rotate 7 steps to the left: [4, 1, 5, 3, -5, 3]
rotate 8 steps to the left: [1, 5, 3, -5, 3, 4]
*/


//CODE: 
package arrays.easy;

public class LeftRotateByPlaceD {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 4, 1, 5, 3, -5};

        rotateArray(arr1, 2);
        rotateArray(arr2, 8);
    }

    public static void rotateArray(int[] arr, int k) {

        while(k!=0) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];
            arr[arr.length - 1] = temp;
            k--;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}

/*
OUTPUT:
3 4 5 6 1 2
1 5 3 -5 3 4
*/
