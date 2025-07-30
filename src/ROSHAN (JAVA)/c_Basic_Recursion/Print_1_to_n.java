/* 
QUESTION:
Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in increasing order from 1 to n.


Examples:
Input: n = 5
Output:
1  
2  
3  
4  
5

Input: n = 1
Output:
1
*/

//CODE: 
package StriverDSA.A_Learn_Basics.c_Basic_Recursion;

public class Print_1_to_n {
    public static void main(String[] args) {
        printNumbers(5);
    }
    static void printNumbers(int n) {
        if (n == 0) return;
        printNumbers(n - 1);
        System.out.println(n);
    }
}
/*
OUTPUT: 
1
2
3
4
5
*/