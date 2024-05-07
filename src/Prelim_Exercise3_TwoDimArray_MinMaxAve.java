/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 3 : Minimum, Maximum and Average using Two Dimensional Array
 * 
 * Expected Output:
 * 
1. Create a Two Dimensional Array  with size [4][4], allowing to store sixteen (16) whole numbers (integer)

int[][] minmaxave = new int[4][4];

2. Prompt the user to enter sixteen (16) whole numbers. Those numbers must be stored in the array minmaxave. You must also display the index address while asking for a value:

Ex.

Enter a number [0][0]: 1
Enter a number [0][1]: 1
Enter a number [0][2]: 1
Enter a number [0][3]: 1
Enter a number [1][0]: 1
Enter a number [1][1]: 1
Enter a number [1][2]: 100
Enter a number [1][3]: 1
Enter a number [2][0]: 1
Enter a number [2][1]: 1
Enter a number [2][2]: 1
Enter a number [2][3]: 1
Enter a number [3][0]: 0
Enter a number [3][1]: 1
Enter a number [3][2]: 1
Enter a number [3][3]: 1

3. After inputting sixteen (16) numbers, display the minimum (lowest number), maximum (highest number) and the average (add all the elements of your array, then divide to the number of elements (ex. 1 + 1 + 1 + 1 + 1 + 1 +100 + 1 + 1 + 1 + 1 + 1 + 0 + 1 + 1 + 1 = 114 / 16 = 7 is the average)). For the minimum and maximum, you must display the array index of the value's location.

Ex.

The minimum is 0, stored at [3][0]
The maximum is 100, stored at [1][2]
The average is 7.0
 * 
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise3_TwoDimArray_MinMaxAve {
	public Prelim_Exercise3_TwoDimArray_MinMaxAve() {

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