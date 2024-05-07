/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo # 11 : String Reverse Demo but not using Stack (soon to be converted to Stack equivalent)
*/

import java.*;
import java.util.Scanner;

public class Demo_String_ReverseWord {
	public Demo_String_ReverseWord() {

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