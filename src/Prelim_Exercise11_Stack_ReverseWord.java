/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 11 : Reversed Word using String and Stack
 * 
 * Expected Output:
 * 
Enter a word: TIME
Reversed Word: EMIT

Condition: You must use stack and the .push() and .pop() methods in this program.
 * 
*/

import java.*;
import java.util.*;

public class Prelim_Exercise11_Stack_ReverseWord {
	public Prelim_Exercise11_Stack_ReverseWord() {

        Scanner x = new Scanner (System.in);
        Stack sample = new Stack();
        
        System.out.print("Enter a word to be reversed: ");
        String input = x.next();        
        int count = input.length();
        
        for (int z=0; z<count; z++) {
            sample.push(input.charAt(z));
        }
        
        System.out.print("Reversed word: ");
        do {
            System.out.print(sample.pop());
        } while (!sample.empty());

	}
}