/* 
QUESTION:
Given an array of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. 
If there are multiple elements that appear a maximum number of times, find the smallest of them.

Examples:
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 3
Explanation: The number 3 appears the most (3 times). It is the most frequent element.

Input: arr = [4, 4, 5, 5, 6]
Output: 4
Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.
*/

//CODE: 
package StriverDSA.A_Learn_Basics.d_Basic_Hashing;

import java.util.HashMap;
import java.util.Map;

public class Highest_Freq_Elem_In_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 3};
        int[] arr2 = {4, 4, 5, 5, 5, 6, 4};
        System.out.println(mostFrequentElement(arr1));
        System.out.println(mostFrequentElement(arr2));
    }

    public static int mostFrequentElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq=0;
        int highest=arr[0];

        for(int i = 0; i < arr.length; i++){
            //for creating hashmap
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
            
            //for finding max
            if(map.get(arr[i]) > maxFreq || (map.get(arr[i]) == maxFreq && arr[i] < highest)){
                maxFreq = map.get(arr[i]);
                highest = arr[i];
            }
        }
        return highest;
    }
}

/*
OUTPUT: 
3
4
*/