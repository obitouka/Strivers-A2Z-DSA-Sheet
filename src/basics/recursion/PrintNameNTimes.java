/* 
QUESTION:
Print name n times
*/

//CODE: 
package striverdsa.basics.recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        func(5);
    }
    
    static void func(int last){
        if(last < 1) return;
        System.out.println("Halz3");
        func(--last);
    }
    
}

/*
OUTPUT: 
Halz3
Halz3
Halz3
Halz3
Halz3
*/