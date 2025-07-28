/*
QUESTION: 
You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.


Examples:
Input: n = 4
Output: 1

Input: n = 14
Output: 2
*/

//CODE: 
package StriverDSA.A_Learn_Basics.b_Basic_Maths;

public class Count_Digits {
    public static void main(String[] args) {
        System.out.println(countDigit(5555));
        System.out.println(countDigit(13));
        System.out.println(countDigit(0));
    }

    public static int countDigit(int n) {
        if(n==0) return 1;

        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
}

/*
OUTPUT: 
4
2
1
*/