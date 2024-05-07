/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Finals
 * Group Activity # 1
*/

import java.*;
import java.util.Scanner;

public class Finals_Shellsort {
	public Finals_Shellsort() {
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