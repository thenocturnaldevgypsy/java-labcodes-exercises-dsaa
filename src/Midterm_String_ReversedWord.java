/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 11
*/

import java.*;
import java.util.Scanner;

public class Midterm_String_ReversedWord {
	public Midterm_String_ReversedWord() {
        Scanner x = new Scanner (System.in);        
        System.out.print("Enter a word to be reversed: ");
        String input = x.next();        
        int count = input.length();        
        System.out.print("Reversed word: ");
        for (int z=count-1;z>=0;z--) {
            System.out.print(input.charAt(z));
        }
	}
}