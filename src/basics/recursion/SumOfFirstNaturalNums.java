/*
QUESTION:
Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.


Examples:
Input : N = 4
Output : 10
Explanation : first four natural numbers are 1, 2, 3, 4.
Sum is 1 + 2 + 3 + 4 => 10.

Input : N = 2
Output : 3
Explanation : first two natural numbers are 1, 2.
Sum is 1 + 2 => 3.
*/

//CODE:
package basics.recursion;
public class SumOfFirstNaturalNums {
    public static void main(String[] args) {
        System.out.println(NnumbersSum(4));
        System.out.println(NnumbersSum(2));
    }
    public static int NnumbersSum(int n) {
        if(n==1) return 1;
        return n + NnumbersSum(n-1);
    }
}

/*
OUTPUT: 
10
3
*/




