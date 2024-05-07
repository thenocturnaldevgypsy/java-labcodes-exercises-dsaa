/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 12
*/

import java.*;
import java.util.*;

public class Midterm_Stack_DecToBin {
	public Midterm_Stack_DecToBin() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a decimal number: ");
		int num = input.nextInt();
		Stack s = new Stack();
		int remainder;		
		do {
			remainder = num%2;
			s.push(remainder);
			num = num/2;
		} while(num!=0);		
		System.out.print("Binary: ");		
		while (!s.empty()){
			System.out.print(s.pop());
		}
	}
}