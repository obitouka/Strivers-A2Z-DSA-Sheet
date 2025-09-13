/* 
QUESTION:
Given a binary array nums, return the maximum number of consecutive 1s in the array.
A binary array is an array that contains only 0s and 1s.


Examples:
Input: nums = [1, 1, 0, 0, 1, 1, 1, 0]
Output: 3
Explanation: The maximum consecutive 1s are present from index 4 to index 6, amounting to 3 1s

Input: nums = [0, 0, 0, 0, 0, 0, 0, 0]
Output: 0
Explanation: No 1s are present in nums, thus we return 0
*/


//CODE: 
package arrays.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 1, 1, 0};
        int[] arr2 = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(findMaxConsecutiveOnes(arr1));
        System.out.println(findMaxConsecutiveOnes(arr2));
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int count =0, max = 0;

        for(int x : arr) {
            if (x == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}

/*
OUTPUT:
3
0
*/
