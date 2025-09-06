/* 
QUESTION:
Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.
You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in decreasing order from n to 1


Examples:
Input: 5
Output:
5
4
3
2
1

Input: 1
Output:
1
*/

//CODE: 
package striverdsa.basics.recursion;

public class PrintNumsNToOne {
    public static void main(String[] args) {
        printNumbers(5);
    }
    public static void printNumbers(int n) {
        if(n==0) return;
        System.out.println(n);
        printNumbers(n - 1);
    }
}

/*
OUTPUT: 
5
4
3
2
1
*/