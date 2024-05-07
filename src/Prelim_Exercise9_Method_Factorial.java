/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 9 : Factorial using Method
 * 
 * Expected Output:
 * 
Create a Java Program based on the output below:

Enter a number: 7
The factorial of 7 is 5040
 
Condition: The computation of the factorial must be coded and perfomed in a method, meaning you must have one void main and one method in your program (one java method for the factorial).
 * 
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise9_Method_Factorial {

    public Prelim_Exercise9_Method_Factorial () {        
        Scanner x = new Scanner (System.in);
        int num, result;
        
        System.out.print("Enter a number: ");
        num = x.nextInt();
        result = Factorial(num);
        System.out.print("The factorial of "+num+" is "+result);
    }
    
    public static int Factorial (int num) {
        int fact = num;
        for (int prod=num-1;prod>0;prod--) {
            fact = fact * prod;
        }
        return fact;
    }

}