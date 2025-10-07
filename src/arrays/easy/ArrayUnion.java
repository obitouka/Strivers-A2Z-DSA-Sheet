/* 
QUESTION:
Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays.
The elements in the union must be in ascending order. The union of two arrays is an array where all values are distinct
and are present in either the first array, the second array, or both.


Examples:
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]

Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
Output: [1, 3, 4, 5, 6, 7, 8, 9]
*/


//CODE: 
package arrays.easy;

import java.util.ArrayList;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; int[] arr2 = {1, 2, 7};
        int[] arr3  = {3, 4, 6, 7, 9, 9}; int[] arr4 = {1, 5, 7, 8, 8};

        System.out.println(unionArray(arr1, arr2));
        System.out.println(unionArray(arr3, arr4));
    }

    public static ArrayList<Integer> unionArray(int[] arr1, int[] arr2) {
        ArrayList<Integer > set = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]){
                if (set.isEmpty() || set.get(set.size()-1) != arr1[i])
                    set.add(arr1[i]);
                i++;
            }else if(arr2[j] <= arr1[i]){
                if (set.isEmpty() || set.get(set.size()-1) != arr2[j])
                    set.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            if (set.get(set.size()-1) != arr1[i])
                set.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            if (set.get(set.size()-1) != arr2[j])
                set.add(arr2[j]);
            j++;
        }

        return set;
    }
}

/*
OUTPUT:

*/
