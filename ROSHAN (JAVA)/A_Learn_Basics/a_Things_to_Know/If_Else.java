/*
QUESTION:
Given marks of a student, print on the screen:

Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.


Examples:
Input: marks = 95
Output: Grade A

Input: marks = 14
Output: Fail
*/

//CODE:
package StriverDSA.A_Learn_Basics.a_Things_to_Know;

public class If_Else {
    public static void main(String[] args) {
        studentGrade(42);
    }

    public static void studentGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}

/*
OUTPUT: 
Grade D
*/