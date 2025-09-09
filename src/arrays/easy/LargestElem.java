/* 
QUESTION:
Given an array of integers nums, return the value of the largest element in the array


Examples:
Input: nums = [3, 3, 6, 1]
Output: 6

Input: nums = [3, 3, 0, 99, -40]
Output: 99
*/


//CODE: 
package arrays.easy;

public class LargestElem {
    public static void main(String[] args) {
        int[] arr1 = {3, 3, 6, 1};
        int[] arr2 = {3, 3, 0, 99, -40};

        System.out.println(largestElement(arr1));
        System.out.println(largestElement(arr2));
    }

    public static int largestElement(int[] arr) {
        int max = arr[0];

        for(int i : arr){
            if(i > max)
                max = i;
        }
        return max;
    }
}

/*
OUTPUT:
6
99
*/
