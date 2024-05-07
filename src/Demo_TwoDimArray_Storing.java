/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo # 6 : Two Dimensional Array  - Storing 
*/

import java.*;
import java.util.Scanner;

public class Demo_TwoDimArray_Storing {
	public Demo_TwoDimArray_Storing() {

        //declaration
        Scanner cursor = new Scanner (System.in);
        String [][] container = new String [2][2];
        int row, col;        
        
        for (row=0; row<=1; ++row) { //for adding value in each cells)
            for (col=0; col<=1; ++col) {
                System.out.print("Enter string value for 2-Dim Array -container- [" + row + "][" + col+ "]: ");
                container [row][col] = cursor.nextLine();
            }
        }
        
        System.out.println("\nThank you for the input!\n");
        for (row=0; row<=1; ++row) { //for displaying the content of the array
            for (col=0; col<=1; ++col) {
                System.out.println("2-Dim Array -container- ["+row+"]["+col+"] contained :"+container [row][col]);
            }
        }

	}
}