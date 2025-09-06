/*
QUESTION: 
Complete the function printNumber which takes an integer input from the user and prints it on the screen.

Examples:
Input(user gives value): 7
Output: 7

Input(user gives value): -5
Output: -5
*/

//CODE:
package basics.fundamentals;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumber(sc);
        sc.close();
    }

    public static void printNumber(Scanner sc) {
        System.out.println("Enter num: ");
        int n = sc.nextInt();  
        System.out.println("Num: "+n);
    }
}
