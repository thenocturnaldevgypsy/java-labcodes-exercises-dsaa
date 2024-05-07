/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Activity # 6
*/

import java.*;
import java.util.Scanner;

public class Prelim_Method_Factorial {
    public Prelim_Method_Factorial () {        
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