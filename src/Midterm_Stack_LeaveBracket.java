/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Activity # 9
*/

import java.*;
import java.util.*;

public class Midterm_Stack_LeaveBracket {
	public Midterm_Stack_LeaveBracket() {
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