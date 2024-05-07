/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 12 : Trim everything except brackets using Stack
 * 
 * Expected Output:
 * 
Enter a string statement, make sure to include { and } in it: fg{{}][ds{}}ksa123{{{}
Trimmed statement: {{}{}}{{{}

Condition: You must use stack and the .push() and .pop() methods in this program.
 * 
*/

import java.*;
import java.util.*;

public class Prelim_Exercise12_Stack_Brackets {
	public Prelim_Exercise12_Stack_Brackets() {

        Scanner x = new Scanner (System.in);
        Stack sample = new Stack();
        System.out.print("Enter a string statement, make sure to include { and } in it: ");
        String input = x.next();        
        int count = input.length();

        for (int z=count-1; z>=0; z--) {
            char trim = input.charAt(z);
            switch (trim) {
            	case '}': case '{':
            		sample.push(input.charAt(z));
            	break;
            }
        }
        System.out.print("Trimmed statement: ");
        do {
            System.out.print(sample.pop());
        } while (!sample.empty());

	}
}