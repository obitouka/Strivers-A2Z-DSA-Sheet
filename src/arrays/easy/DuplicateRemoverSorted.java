/* 
QUESTION:
Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that
each unique element appears only once. Return the number of unique elements in the array.

If the number of unique elements be k, then,
    - Change the array nums such that the first k elements of nums contain the unique values in the order
    that they were present originally.
    - The remaining elements, as well as the size of the array does not matter in terms of correctness.


Examples:
Input: nums = [0, 0, 3, 3, 5, 6]
Output: 4
Explanation: Resulting array = [0, 3, 5, 6, _, _]
There are 4 distinct elements in nums and the elements marked as _ can have any value.

Input: nums = [-2, 2, 4, 4, 4, 4, 5, 5]
Output: 4
Explanation: Resulting array = [-2, 2, 4, 5, _, _, _, _]
There are 4 distinct elements in nums and the elements marked as _ can have any value.
*/


//CODE: 
package arrays.easy;

public class DuplicateRemoverSorted {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 3, 3, 5, 6};
        int[] arr2 = {-2, 2, 4, 4, 4, 4, 5, 5};

        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));
    }

    public static int removeDuplicates(int[] arr) {
        int i=0;

        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                arr[++i] = arr[j];
            }
        }
        return (i+1);
    }
}

/*
OUTPUT:
4
4
*/
