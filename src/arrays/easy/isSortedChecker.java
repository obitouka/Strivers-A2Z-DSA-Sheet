/*
QUESTION:
Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.


Examples:
Input : nums = [1, 2, 3, 4, 5]
Output : true
Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.

Input : nums = [1, 2, 1, 4, 5]
Output : false
Explanation : For i == 2 it does not hold nums[i] <= nums[i+1], hence it is not sorted and we return false.
*/


//CODE:
package arrays.easy;

public class isSortedChecker {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 1, 4, 5};

        System.out.println(isSorted(arr1));
        System.out.println(isSorted(arr2));
    }

    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(!(arr[i] >= arr[i-1]))
                return false;
        }
        return true;
    }
}

/*
OUTPUT:
true
false
*/
