/*
QUESTION:
Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k.
If no such sub-array exists, return 0.


Examples:
Input: nums = [10, 5, 2, 7, 1, 9],  k=15
Output: 4
Explanation: The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts
at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

Input: nums = [-3, 2, 1], k=6
Output: 0
Explanation: There is no sub-array in the array that sums to 6. Therefore, the output is 0.
*/


//CODE:
package arrays.easy;

public class LongestSubarraySumKp {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 2, 7, 1, 9};
        int[] arr2 = {-3, 2, 1};
        System.out.println(longestSubarray(arr1, 15));
        System.out.println(longestSubarray(arr2, 6));
    }

    public static int longestSubarray(int[] arr, int k) {
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k)
                    len = Math.max(len, j-i+1);
            }
        }

        return len;
    }
}

/*
OUTPUT:
4
0
*/
