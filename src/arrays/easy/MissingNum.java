/*
QUESTION:
Given an integer array of size n containing distinct values in the range from 0 to n (inclusive),
return the only number missing from the array within this range.


Examples:
Input: nums = [0, 2, 3, 1, 4]
Output: 5

Input: nums = [0, 1, 2, 4, 5, 6]
Output: 3
*/


//CODE:
package arrays.easy;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 3, 1, 4};
        int[] arr2 = {0, 1, 2, 4, 5, 6};
        System.out.println(missingNumber(arr1));
        System.out.println(missingNumber(arr2));
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;

        for(int x : arr)
            actual += x;

        return expected - actual;
    }
}

/*
OUTPUT:
5
3
*/
