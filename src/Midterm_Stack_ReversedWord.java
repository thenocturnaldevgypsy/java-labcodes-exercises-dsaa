/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Activity # 8
*/

import java.*;
import java.util.*;

public class Midterm_Stack_ReversedWord {
	public Midterm_Stack_ReversedWord() {
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