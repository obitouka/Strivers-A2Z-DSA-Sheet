/* 
QUESTION:
You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. 
Return the GCD of the two numbers. The Greatest Common Divisor (GCD) of two integers is the largest positive integer 
that divides both of the integers.


Examples:
Input: n1 = 4, n2 = 6
Output: 2
Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6
Greatest Common divisor = 2.

Input: n1 = 9, n2 = 8
Output: 1
Explanation: Divisors of n1 = 1, 3, 9 Divisors of n2 = 1, 2, 4, 8.
Greatest Common divisor = 1.
*/

//CODE: 
package StriverDSA.A_Learn_Basics.b_Basic_Maths;

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(7,4));
    }
    public static int GCD(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}

/*
OUTPUT: 

*/