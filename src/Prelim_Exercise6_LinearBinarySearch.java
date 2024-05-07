/*
* Course: Data Structure and Algorithm Analysis
* Period: Prelim
* Exercise # 6 : Linear and Binary Searching using arrays
*
* Expected Output:
* 
1. You must ask the user for the size of the array. Note that you must use one/single dimensional array and the size of your array is dynamic.

Enter the size of the array: 5

2. Ask the user to enter a whole X times. X is based on the size of your array defined by your user. You must also show the array index while asking for a value.

Enter value for [0] : 
1
Enter value for [1] : 3
Enter value for [2] : 6
Enter value for [3] : 2
Enter value for [4] : 8

3. Ask the user for the target value for searching. Note that the user can input any number, even it does not belong to the elements stored in the array.

Enter the target values to be searched: 6

4. Let the user choose if he/she want to use linear or binary searching. Note that just in case that the user typed in an invalid input, the program must be notify and asked for an input again.

[1] Linear Search | [2] Binary Search
Choose the searching algorithm to be used [1 or 2]: 4
Invalid input! Choose the searching algorithm to be used [1 or 2]: 2

5. When the user typed in a valid input. You must show the simulation for each searching algorithm. Your out must look like the following sample outputs below:

*for Linear Searching*

You choose Linear Searching

- Is array[0] : 
1 == 6? FALSE
- Is array[1] : 3 == 6? FALSE
- Is array[2] : 6 == 6? TRUE, stored at [2]

*for Binary Searching*

You choose Binary Searching

Let us sort the array first
[0][1][2][3][4]
[1][2][3][6][8]
Done sorting

middle = [0 + 4 = 4 / 2 = 2] = 2
- Is array[2] : 
3 <, >, =  6? <, FALSE
middle = [3 + 4 = 7 / 2 = 3.5] = 4
- Is array[4] : 8 <, >, =  6? >, FALSE
middle = [3 + 3 = 6 / 2 = 3] = 3
- Is array[3] : 6 <, >, =  6? =, TRUE, stored at [3]
*
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise6_LinearBinarySearch {
	public Prelim_Exercise6_LinearBinarySearch() {



	}
}