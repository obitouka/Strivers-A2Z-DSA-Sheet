/* 
QUESTION:
You are given an integer n. You need to check if the number is prime or not. 
Return true if it is a prime number, otherwise return false.
A prime number is a number which has no divisors except 1 and itself.


Examples:
Input: n = 5
Output: true
Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.

Input: n = 8
Output: false
Explanation: The divisors of 8 are 1, 2, 4, 8, thus it is not a prime number.
*/

//CODE: 
package StriverDSA.A_Learn_Basics.b_Basic_Maths;

public class Check_Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(8));
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;

        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}

/*
OUTPUT: 
true
false
*/