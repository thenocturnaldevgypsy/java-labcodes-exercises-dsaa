/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo # 12 : Stack - Decimal to Binary
*/

import java.*;
import java.util.*;

public class Demo_Stack_DecToBin {
	public Demo_Stack_DecToBin() {

		Scanner input = new Scanner (System.in);
		System.out.print("Enter a decimal (integer) number: ");
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