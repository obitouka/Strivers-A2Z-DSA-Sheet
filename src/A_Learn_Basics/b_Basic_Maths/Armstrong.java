/* 
QUESTION:
You are given an integer n. You need to check whether it is an armstrong number or not. 
Return true if it is an armstrong number, otherwise return false. An armstrong number is a number which is equal 
to the sum of the digits of the number, raised to the power of the number of digits.


Examples:
Input: n = 153
Output: true
Explanation: Number of digits : 3.
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.

Input: n = 12
Output: false
Explanation: Number of digits : 2.
1^2 + 2^2 = 1 + 4 = 5.
Therefore, it is not an Armstrong number.
*/

//CODE: 
package StriverDSA.A_Learn_Basics.b_Basic_Maths;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(12));
    }

    public static boolean isArmstrong(int n) {
        int orig = n;
        int numOfDigits = CountDig(n);
        int sum=0;

        while(n!=0){
            int temp = n % 10;

            //TO MULTIPLY THE POW
            int pow = 1;
            for(int i=1 ; i<=numOfDigits; i++)
                pow *= temp;
            
            sum+=pow; // sum+=Math.pow(temp, numOfDigits);
            n/=10;
        }

        if(sum == orig)
            return true;
        else return false;
    }

    public static int CountDig(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}

/*
OUTPUT: 
true
false
*/