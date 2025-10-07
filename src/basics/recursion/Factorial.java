/* 
QUESTION:
https://takeuforward.org/plus/dsa/problems/factorial-of-a-given-number
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

*/