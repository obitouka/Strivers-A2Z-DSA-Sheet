/* 
QUESTION:
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.


Examples:
Input: n = 25
Output: 52

Input: n = 123
Output: 321
*/

//CODE: 
package StriverDSA.A_Learn_Basics.b_Basic_Maths;

public class Reverse_Num {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }

    public static int reverseNumber(int n) {
        int rev=0;
        while(n!=0){
            int dig = n % 10;
            rev = rev*10 + dig;
            n/=10;
        }
        return rev;
    }
}

/*
OUTPUT: 
321
*/
