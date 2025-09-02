/* 
QUESTION:
Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.


Examples:
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]

Input: n=6, arr = [1,2,1,1,5,1]
Output: [1,5,1,1,2,1]
*/

//CODE: 
package StriverDSA.A_Learn_Basics.c_Basic_Recursion;

import java.util.Arrays;

public class Reverse_Array {
    int i=0;
    
    public static void main(String[] args) {
        //1st method
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 1, 1, 5, 1};
        reverse(arr1, 0, arr1.length);
        reverse(arr2, 0, arr2.length);
        for(int x:arr1){
            System.out.print(x+" ");
        }
        //OR        
        System.out.println("\n"+Arrays.toString(arr2));
    }
    
    public static void reverse(int[] arr, int left, int right) {
        if (left >= right-1) return;

        int temp = arr[left];
        arr[left] = arr[right-1];
        arr[right-1 ] = temp;

        reverse(arr, left + 1, right - 1);
    }
}

/*
OUTPUT: 
[5, 4, 3, 2, 1]
[1, 5, 1, 1, 2, 1]
*/