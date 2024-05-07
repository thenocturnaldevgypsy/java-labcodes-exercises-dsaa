/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Activity # 3
*/

import java.*;
import java.util.Scanner;

public class Prelim_TwoDimArray_MinMax {
	public Prelim_TwoDimArray_MinMax() {

        Scanner x = new Scanner (System.in);
        int row, col, max, min, sum = 0;
        String minindex = "[0][0]", maxindex = "[0][0]";
        int[][] inputs = new int[4][4];
        double ave;
        
        for (row=0;row<=3;++row) {
            for (col=0;col<=3;++col) {
                System.out.print("Enter value for ["+row+"]["+col+"]: ");
                inputs[row][col] = x.nextInt();
            }
        }
        
        min = inputs[0][0];
        max = inputs[0][0];
        for (row=0;row<=3;++row) {
            for (col=0;col<=3;++col) {
                if (inputs[row][col]<min) {
                    min = inputs[row][col];
                    minindex = "["+row+"]["+col+"]";
                }
                if (inputs[row][col]>max) {
                    max = inputs[row][col];
                    maxindex = "["+row+"]["+col+"]";
                }
                sum = sum + inputs[row][col];
            }
        }
        ave = sum / 16;
        
        System.out.println();
        System.out.println("The minimum is "+min+", stored at "+minindex);
        System.out.println("The maximum is "+max+", stored at "+maxindex);
        System.out.println("The average is "+ave);
        
	}
}