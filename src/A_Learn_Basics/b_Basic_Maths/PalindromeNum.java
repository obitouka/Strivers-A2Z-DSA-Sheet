/* 
QUESTION:
You are given an integer n. You need to check whether the number is a palindrome number or not. 
Return true if it's a palindrome number, otherwise return false.
A palindrome number is a number which reads the same both left to right and right to left.


Examples:
Input: n = 121
Output: true

Input: n = 123
Output: false
*/

//CODE: 
package StriverDSA.A_Learn_Basics.b_Basic_Maths;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }
    public static boolean isPalindrome(int n) {
        if(n<0) return false; 

        int rev=0;
        int temp=n;

        while (n!=0) {
            int dig = n%10;
            rev = rev*10 + dig;
            n/=10;
        }

        if(temp==rev)
            return true;
        else return false;
    }
}

/*
OUTPUT: 
true
false
*/