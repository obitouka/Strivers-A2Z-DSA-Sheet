/* 
QUESTION:
Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target
appears in the array. If the target is not found in the array, return -1.


Examples:
Input: nums = [2, 3, 4, 5, 3], target = 3
Output: 1

Input: nums = [2, -4, 4, 0, 10], target = 6
Output: -1
*/


//CODE: 
package arrays.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 3};
        int[] arr2 = {2, -4, 4, 0, 10};

        System.out.println(linearSearch(arr1, 3));
        System.out.println(linearSearch(arr2, 6));
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }
}

/*
OUTPUT:
1
-1
*/
