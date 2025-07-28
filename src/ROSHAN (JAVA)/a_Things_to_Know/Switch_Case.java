/*
QUESTION: 
Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday 
and for values greater than 7 or less than 1, print Invalid. Ensure only the 1st letter of the answer is capitalised.


Examples:
Input: day = 3
Output: Wednesday

Input: day = 8
Output: Invalid
*/


//CODE: 
package StriverDSA.A_Learn_Basics.a_Things_to_Know;

public class Switch_Case {
    public static void main(String[] args) {
        whichWeekDay(7);
    }

    public static void whichWeekDay(int day) {
        switch (day) {
            case 1: System.out.println("SUNDAY"); break;
            case 2: System.out.println("MONDAY"); break;
            case 3: System.out.println("TUESDAY"); break;
            case 4: System.out.println("WEDNESDAY"); break;
            case 5: System.out.println("THURSDAY"); break;
            case 6: System.out.println("FRIDAY"); break;
            case 7: System.out.println("SATURDAY"); break;
            default: System.out.println("Invalid day number"); break;
        }
    }
}

/*
OUTPUT: 
SATURDAY
*/