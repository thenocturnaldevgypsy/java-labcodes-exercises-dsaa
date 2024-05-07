/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 5 : Bubblesort using array 
 * 
 * Expected Output:
 * 
Output:

Enter number 1: 1
Enter number 2: 10
Enter number 3: 2
Enter number 4: 9
Enter number 5: 3
Enter number 6: 8
Enter number 7: 4
Enter number 8: 7
Enter number 9: 5
Enter number 10: 6

Display unsorted list: 1 10 2 9 3 8 4 7 5 6 

Simulation using Bubble Sort. Start.

[0] 1 > [1] 10 ? FALSE. No swap.
[1] 10 > [2] 2 ? TRUE. Swap 10 and 2.
[2] 10 > [3] 9 ? TRUE. Swap 10 and 9.
[3] 10 > [4] 3 ? TRUE. Swap 10 and 3.
[4] 10 > [5] 8 ? TRUE. Swap 10 and 8.
[5] 10 > [6] 4 ? TRUE. Swap 10 and 4.
[6] 10 > [7] 7 ? TRUE. Swap 10 and 7.
[7] 10 > [8] 5 ? TRUE. Swap 10 and 5.
[8] 10 > [9] 6 ? TRUE. Swap 10 and 6.
Reached the end of the list. Swap > 0? TRUE. Repeat process.

[0] 1 > [1] 2 ? FALSE. No swap.
[1] 2 > [2] 9 ? FALSE. No swap.
[2] 9 > [3] 3 ? TRUE. Swap 9 and 3.
[3] 9 > [4] 8 ? TRUE. Swap 9 and 8.
[4] 9 > [5] 4 ? TRUE. Swap 9 and 4.
[5] 9 > [6] 7 ? TRUE. Swap 9 and 7.
[6] 9 > [7] 5 ? TRUE. Swap 9 and 5.
[7] 9 > [8] 6 ? TRUE. Swap 9 and 6.
[8] 9 > [9] 10 ? FALSE. No swap.
Reached the end of the list. Swap > 0? TRUE. Repeat process.

[0] 1 > [1] 2 ? FALSE. No swap.
[1] 2 > [2] 3 ? FALSE. No swap.
[2] 3 > [3] 8 ? FALSE. No swap.
[3] 8 > [4] 4 ? TRUE. Swap 8 and 4.
[4] 8 > [5] 7 ? TRUE. Swap 8 and 7.
[5] 8 > [6] 5 ? TRUE. Swap 8 and 5.
[6] 8 > [7] 6 ? TRUE. Swap 8 and 6.
[7] 8 > [8] 9 ? FALSE. No swap.
[8] 9 > [9] 10 ? FALSE. No swap.
Reached the end of the list. Swap > 0? TRUE. Repeat process.

[0] 1 > [1] 2 ? FALSE. No swap.
[1] 2 > [2] 3 ? FALSE. No swap.
[2] 3 > [3] 4 ? FALSE. No swap.
[3] 4 > [4] 7 ? FALSE. No swap.
[4] 7 > [5] 5 ? TRUE. Swap 7 and 5.
[5] 7 > [6] 6 ? TRUE. Swap 7 and 6.
[6] 7 > [7] 8 ? FALSE. No swap.
[7] 8 > [8] 9 ? FALSE. No swap.
[8] 9 > [9] 10 ? FALSE. No swap.
Reached the end of the list. Swap > 0? TRUE. Repeat process.

[0] 1 > [1] 2 ? FALSE. No swap.
[1] 2 > [2] 3 ? FALSE. No swap.
[2] 3 > [3] 4 ? FALSE. No swap.
[3] 4 > [4] 5 ? FALSE. No swap.
[4] 5 > [5] 6 ? FALSE. No swap.
[5] 6 > [6] 7 ? FALSE. No swap.
[6] 7 > [7] 8 ? FALSE. No swap.
[7] 8 > [8] 9 ? FALSE. No swap.
[8] 9 > [9] 10 ? FALSE. No swap.
Reached the end of the list. Swap > 0? FALSE. Process complete.

Display sorted list: 1 2 3 4 5 6 7 8 9 10
 * 
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise5_BubbleSort {
	public Prelim_Exercise5_BubbleSort() {

        Scanner x = new Scanner (System.in);
        int[] stock = new int[10];
        int index1, index2, cnt;
        
        for (index1=0;index1<stock.length;++index1) {
            cnt = index1 + 1;
            System.out.print("Enter number "+cnt+": ");
            stock[index1] = x.nextInt();
        }
        
        System.out.print("\nDisplay unsorted list: ");

        for (index1=0;index1<stock.length;++index1) {
            System.out.print(stock[index1]+" ");
        }
        
        System.out.println("\n\nSimulation using Bubble Sort. Start.\n");
        
        boolean swap = true;
        int temp = 0;
        
        do {
            
            swap = false;
            for (index1=0;index1<stock.length-1;++index1) {

                index2 = index1 + 1;
                System.out.print("["+index1+"] "+stock[index1]+" > ["+index2+"] "+stock[index2]+" ? ");

                if (stock[index1]>stock[index2]) {
                    System.out.println("TRUE. Swap "+stock[index1]+" and "+stock[index2]+".");
                    temp = stock[index1];
                    stock[index1] = stock[index2];
                    stock[index2] = temp;
                    swap = true;
                } else {
                    System.out.println("FALSE. No swap.");
                }

            }
            
            System.out.print("Reached the end of the list. Swap > 0? ");
            if (swap==true) {
                System.out.println("TRUE. Repeat process.\n");
            } else {
                System.out.println("FALSE. Process complete.\n");
            }

        } while (swap==true);
        
        System.out.print("Display sorted list: ");

        for (index1=0;index1<stock.length;++index1) {
            System.out.print(stock[index1]+" ");
        }
		
	}
}