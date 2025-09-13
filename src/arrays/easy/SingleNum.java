/* 
QUESTION:
Given an array of nums of n integers. Every integer in the array appears twice except one integer.
Find the number that appeared once in the array.


Examples:
Input : nums = [1, 2, 2, 4, 3, 1, 4]
Output : 3
Explanation : The integer 3 has appeared only once.

Input : nums = [5]
Output : 5
Explanation : The integer 5 has appeared only once.
*/


//CODE: 
package arrays.easy;

public class SingleNum {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4, 3, 1, 4};
        int[] arr2 = {5};
        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
    }

    public static int singleNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == 1) return arr[i];
        }
        return -1;
    }
}

/*
OUTPUT:
3
5
*/
