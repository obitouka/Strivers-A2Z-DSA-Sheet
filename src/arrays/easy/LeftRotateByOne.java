/* 
QUESTION:
Given an integer array nums, rotate the array to the left by one.
Note: There is no need to return anything, just modify the given array.


Examples:
Input: nums = [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]
Explanation: Initially, nums = [1, 2, 3, 4, 5]
Rotating once to left -> nums = [2, 3, 4, 5, 1]

Input: nums = [-1, 0, 3, 6]
Output: [0, 3, 6, -1]
Explanation:Initially, nums = [-1, 0, 3, 6]
Rotating once to left -> nums = [0, 3, 6, -1]
*/


//CODE: 
package arrays.easy;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-1, 0, 3, 6};

        rotateArrayByOne(arr1);
        rotateArrayByOne(arr2);
    }

    public static void rotateArrayByOne(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

/*
OUTPUT:
[2, 3, 4, 5, 1]
[0, 3, 6, -1]
*/
