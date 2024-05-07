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

import java.util.Scanner;
import java.util.Arrays;

public class Prelim_Exercise6_LinearBinarySearch {

	public Prelim_Exercise6_LinearBinarySearch() {

		Scanner scanner = new Scanner(System.in);

        //Ask for array size
        int size = 0;
        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Invalid input! Array size must be greater than 0.");
            }
        } while (size <= 0);
        int[] arr = new int[size];

        // Populate the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for [" + i + "] : ");
            arr[i] = scanner.nextInt();
        }

        // Ask for the target value
        System.out.print("Enter the target value to be searched: ");
        int target = scanner.nextInt();

        // Choose the searching algorithm
        int choice = 0;
        do {
            System.out.println("[1] Linear Search | [2] Binary Search");
            System.out.print("Choose the searching algorithm to be used [1 or 2]: ");
            choice = scanner.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid input! Please choose 1 or 2.");
            }
        } while (choice != 1 && choice != 2);

        // Perform the chosen search
        if (choice == 1) {
            System.out.println("\nYou choose Linear Searching\n");
            boolean found = false;
            for (int i = 0; i < size; i++) {
                System.out.println("- Is array[" + i + "] : " + arr[i] + " == " + target + "? " + (arr[i] == target ? "TRUE, stored at [" + i + "]" : "FALSE"));
                if (arr[i] == target) {
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Target value not found in the array.");
            }
        } else {
            System.out.println("\nYou choose Binary Searching\n");
            // Sort the array before binary search
            Arrays.sort(arr);
            System.out.println("Let us sort the array first");
            displayArray(arr);
            System.out.println("Done sorting\n");

            int low = 0;
            int high = size - 1;
            boolean found = false;
            while (low <= high) {
                int mid = (low + high) / 2;
                System.out.println("middle = [" + low + " + " + high + " = " + (low + high) + " / 2 = " + mid + "]");
                System.out.println("- Is array[" + mid + "] : " + arr[mid] + " <, >, = " + target + "? "
                        + (arr[mid] < target ? "<," : (arr[mid] > target ? ">," : "="))
                        + " " + (arr[mid] == target ? "TRUE, stored at [" + mid + "]" : "FALSE"));
                if (arr[mid] == target) {
                    found = true;
                    break;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (!found) {
                System.out.println("Target value not found in the array.");
            }
        }

        //scanner.close();
    }

	public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print("[" + num + "]");
        }
        System.out.println();
    }
	
}