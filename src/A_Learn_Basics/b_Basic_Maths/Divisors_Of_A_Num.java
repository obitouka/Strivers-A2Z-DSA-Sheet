/* 
QUESTION:
You are given an integer n. You need to find all the divisors of n. 
Return all the divisors of n as an array or list in a sorted order.
A number which completely divides another number is called it's divisor.


Examples:
Input: n = 6
Output = [1, 2, 3, 6]
Explanation: The divisors of 6 are 1, 2, 3, 6.

Input: n = 8
Output: [1, 2, 4, 8]
Explanation: The divisors of 8 are 1, 2, 4, 8.
*/

//CODE: 
package StriverDSA.A_Learn_Basics.b_Basic_Maths;

public class Divisors_Of_A_Num {
    public static void main(String[] args) {
        printArray(numOfDivisors(8)); 
        printArray(numOfDivisors(6));
    }

    public static int[] numOfDivisors(int n) {
        int count = 0;

        int[] divisors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                divisors[index++] = i;
            }
        }
        return divisors;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) 
            System.out.print(num + " ");
        System.out.println();
    }
}

/*
OUTPUT: 
1 2 4 8 
1 2 3 6
*/