/* 
QUESTION:
Given an array of integers nums, return the second-largest element in the array.
If the second-largest element does not exist, return -1.

Examples:
Input: nums = [8, 8, 7, 6, 5]
Output: 7


Input: nums = [10, 10, 10, 10, 10]
Output: -1
*/


//CODE: 
package arrays.easy;

public class SecondLargestElem {
    public static void main(String[] args) {
        int[] arr1 = {8, 8, 7, 6, 5};
        int[] arr2 = {10, 10, 10, 10, 10};

        System.out.println(secondLargestElement(arr1));
        System.out.println(secondLargestElement(arr2));
    }

    public static int largestElement(int[] arr) {
        int largest = arr[0];

        for(int i : arr){
            if(i > largest)
                largest = i;
        }
        return largest;
    }

    public static int secondLargestElement(int[] arr) {
        int largest = largestElement(arr);
        int secLargest = -1;

        for(int j : arr){
            if(j > secLargest && j != largest)
                secLargest = j;
        }
        return secLargest;
    }
}

/*
OUTPUT:
7
-1
*/
