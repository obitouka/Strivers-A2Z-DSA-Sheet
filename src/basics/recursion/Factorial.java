/* 
QUESTION:
Write a recursive program to compute the factorial of a given number n.

Examples:
Input : n = 4
Output : 24
Explanation : 4! = 4 × 3 × 2 × 1 = 24

Input : n = 6
Output : 720
Explanation : 6! = 6 × 5 × 4 × 3 × 2 × 1 = 720
*/

//CODE: 
package basics.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact(3));
    }

    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }

}

/*
OUTPUT: 
120
6
*/