/*
QUESTION:
Given a string s, return true if the string is palindrome, otherwise false.
A string is called palindrome if it reads the same forward and backward.


Examples:
Input : s = "hannah"
Output : true
Explanation : The string when reversed is --> "hannah", which is same as original string , so we return true.

Input : s = "aabbaaa"
Output : false
Explanation : The string when reversed is --> "aaabbaa", which is not same as original string, So we return false.
*/

//CODE:
package basics.recursion;
public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("hannah"));
        System.out.println(palindromeCheck("aabbaaa"));
    }
    public static boolean palindromeCheck(String s) {
        if (s.length() <= 1) 
            return true;

        if (s.charAt(0) != s.charAt(s.length()-1)) 
            return false;
        
        return palindromeCheck(s.substring(1, s.length()-1));
    }
}

/*
OUTPUT: 
true
false
*/