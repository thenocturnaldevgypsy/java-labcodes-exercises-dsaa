/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 2 : Minimum, Maximum and Average using One Dimensional Array
 * 
 * Expected Output:
 * 
1. Create a One/Single Dimensional Array for storing ten (10) whole numbers
(integer)

int[] minmaxave = new int[10];

2. Prompt the user to enter ten (10) whole numbers. Those numbers must be stored
in the array minmaxave.

Ex.

Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
Enter a number: 6
Enter a number: 7
Enter a number: 8
Enter a number: 9
Enter a number: 10

3. After inputting the ten (10) numbers, display the minimum (lowest number),
maximum (highest number) and the average (add all the elements of your array,
then divide to the number of elements (ex. 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 +
10 = 55 / 10 = 5.5 is the average))

Ex.

The minimum is 1
The maximum is 10
The average is 5.5
 * 
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise2_OneDimArray_MinMaxAve {
	public Prelim_Exercise2_OneDimArray_MinMaxAve() {

        Scanner x = new Scanner (System.in);
        int[] values = new int[10];
        int min, minloc, max, maxloc, sum = 0, cnt;
        double ave;
        
        for (cnt=0;cnt<values.length;++cnt) {
            System.out.print("Enter a number for ["+cnt+"]: ");
            values[cnt] = x.nextInt();
        }
        
        min = values[0];
        minloc = 0;
        max = values[0];
        maxloc = 0;
        
        for (cnt=0;cnt<values.length;++cnt) {

            if (values[cnt]<min) {
                min = values[cnt];
                minloc = cnt;
            }
            if (values[cnt]>max) {
                max = values[cnt];
                maxloc = cnt;
            }
            sum = sum + values[cnt];
            
        }
        
        ave = sum / 10;
        
        System.out.println("\nThe mimimum is "+min+", stored at ["+minloc+"]");
        System.out.println("The maximum is "+max+", stored at ["+maxloc+"]");
        System.out.print("The average is "+ave);
		
	}

}