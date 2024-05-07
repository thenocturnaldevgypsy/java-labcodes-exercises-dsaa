/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Finals
 * Exercise # 1: N-sort
 * 
 * Expected Output:
 * 
Create a Java program with the following requirements: 

REQUIREMENTS:
- create a one dimensional array, the size will be based on the answer in the "Enter the number of values to be inserted". Example: if the user inputted 8, that means you must create a one dimensional array with the size of 8.
- prompt the user to input number (the number of input based on the answer in the "Enter the number of values to be inserted"). save the numbers inputted in your one dimensional arrray.
- ask the user for the required N-sort. please note of the two rules in N-sorting under shellsort: (1) zero (0) is not valid N and (2) it can only be ranging from one (1) up to the half of the inputted number of elements. so if the number of elements is 8, that means the valid N is ranging from 1 to 4 only.
- after the user inputted the valid value for N, display the numbers inputted earlier and stored in your one dimensional array.
- implement the shellsorting afterwards.

OUTPUT:

Enter the number of values to be inserted: 8

Type a number: 8
Type a number: 7
Type a number: 6
Type a number: 5
Type a number: 4
Type a number: 3
Type a number: 2
Type a number: 1

Enter the required N-sort: 7
The N is either less than or more than the required N sort value.

Enter the required N-sort: 0
The N is either less than or more than the required N sort value.

Enter the required N-sort: 4

Current content of the 4-sorted:

8  7  6  5  
4  3  2  1  

Sorted content of the 4-sorted:

4  3  2  1  
8  7  6  5
 * 
*/

import java.*;
import java.util.Scanner;

public class Finals_Exercise1_NSort {
	public Finals_Exercise1_NSort () {

		Scanner x = new Scanner (System.in);
		int number, input, shell, half;

		System.out.print("Enter the number of values to be inserted: ");
		number = x.nextInt();
		System.out.println();

		int[] container = new int[number]; //create the initial container

		for (int i=0;i<container.length;i++) {
			System.out.print("Type a number: ");
			input = x.nextInt();
			container[i] = input;
		}
		
		half = number / 2;
		shell = half++;
		
		int loop = 1;
		do {			
			System.out.print("\nEnter the required N-sort: ");
			shell = x.nextInt();
			if ((shell > half) || (shell == 0)) {
				System.out.println("The N is either less than or more than the required N sort value.");
			} else {
				loop = 0;
			}
		} while (loop != 0) ;

		int row = number / shell;
		int rem = number % shell;

		if (rem != 0)
			row++;

		int[][] shellsort = new int[row][shell];

		int oneDimcnt = 0;
		for (int r=0;r<row;r++) {
			for (int c=0;c<shell;c++) {
				if (oneDimcnt == number) {
					c = shell;
					r = row;
				} else {
					shellsort[r][c] = container[oneDimcnt];
					oneDimcnt++;
				}
			}
		}

		System.out.println("\nCurrent content of the "+shell+"-sorted:\n");
		for (int r=0;r<row;r++) {
			for (int c=0;c<shell;c++) {
				if (shellsort[r][c] != 0)
					System.out.print(shellsort[r][c]+"  ");
			}
			System.out.println();
		}

		//start sorting for each column
		for (int c=0;c<shell;c++) {
			boolean swap;
			do {
				swap = false;
				for (int r=0;r<row-1;++r) {
					int rnext = r++;
					if (shellsort[r][c]<shellsort[rnext][c]) {
						int temp = shellsort[r][c];
						shellsort[r][c] = shellsort[rnext][c];
						shellsort[rnext][c] = temp;
						swap = true;
					}
				}
			} while (swap == true);
		}
		
		System.out.println("\nSorted content of the "+shell+"-sorted:\n");
		for (int r=0;r<row;r++) {
			for (int c=0;c<shell;c++) {
				if (shellsort[r][c] != 0)
					System.out.print(shellsort[r][c]+"  ");
			}
			System.out.println();
		}

	}
}