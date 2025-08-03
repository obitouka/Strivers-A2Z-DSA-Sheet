/* 
QUESTION:
Print name n times
*/

//CODE: 
package StriverDSA.A_Learn_Basics.c_Basic_Recursion;

public class Print_Name_n_Times {
    public static void main(String[] args) {
        func(1,5);
    }
    
    static void func(int inital, int last){
        if(inital > last) return;
        System.out.println("Halz3");
        func(inital+1, last);

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