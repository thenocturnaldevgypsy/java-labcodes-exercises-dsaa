/*
* Course: Data Structure and Algorithm Analysis
* Period: Prelim
* Exercise # 7 :  Insertion Sort and Selection Sort using arrays
*
* Expected Output:
* 
Create a Java program with the following requirements/0utput:

Enter number 1: 3
Enter number 2: 2
Enter number 3: 0
Enter number 4: 9
Enter number 5: 1
Enter number 6: 4
Enter number 7: 7
Enter number 8: 8
Enter number 9: 5
Enter number 10: 6

Display unsorted list: 3 2 0 9 1 4 7 8 5 6 

[1] Insertion Sort | [2] Selection Sort

Choose which sort algorithm to be used: 4
Invalid Input! Choose which sort algorithm to be used: 7
Invalid Input! Choose which sort algorithm to be used: 

== IF 1 or INSERTION SORT ==

You choose Insertion Sort.

Insert 2
[1]: 2 < [0]: 3 ? TRUE. Shift 3, insert 2.
Current sorted list: 2 3 

Insert 0
[2]: 0 < [1]: 3 ? TRUE. Shift 3, insert 0.
[1]: 0 < [0]: 2 ? TRUE. Shift 2, insert 0.
Current sorted list: 0 2 3 

Insert 9
[3]: 9 < [2]: 3 ? FALSE. Location OK.
Current sorted list: 0 2 3 9 

Insert 1
[4]: 1 < [3]: 9 ? TRUE. Shift 9, insert 1.
[3]: 1 < [2]: 3 ? TRUE. Shift 3, insert 1.
[2]: 1 < [1]: 2 ? TRUE. Shift 2, insert 1.
[1]: 1 < [0]: 0 ? FALSE. Location OK.
Current sorted list: 0 1 2 3 9 

Insert 4
[5]: 4 < [4]: 9 ? TRUE. Shift 9, insert 4.
[4]: 4 < [3]: 3 ? FALSE. Location OK.
Current sorted list: 0 1 2 3 4 9 

Insert 7
[6]: 7 < [5]: 9 ? TRUE. Shift 9, insert 7.
[5]: 7 < [4]: 4 ? FALSE. Location OK.
Current sorted list: 0 1 2 3 4 7 9 

Insert 8
[7]: 8 < [6]: 9 ? TRUE. Shift 9, insert 8.
[6]: 8 < [5]: 7 ? FALSE. Location OK.
Current sorted list: 0 1 2 3 4 7 8 9 

Insert 5
[8]: 5 < [7]: 9 ? TRUE. Shift 9, insert 5.
[7]: 5 < [6]: 8 ? TRUE. Shift 8, insert 5.
[6]: 5 < [5]: 7 ? TRUE. Shift 7, insert 5.
[5]: 5 < [4]: 4 ? FALSE. Location OK.
Current sorted list: 0 1 2 3 4 5 7 8 9 

Insert 6
[9]: 6 < [8]: 9 ? TRUE. Shift 9, insert 6.
[8]: 6 < [7]: 8 ? TRUE. Shift 8, insert 6.
[7]: 6 < [6]: 7 ? TRUE. Shift 7, insert 6.
[6]: 6 < [5]: 5 ? FALSE. Location OK.

Display sorted list: 0 1 2 3 4 5 6 7 8 9

== IF 2 or SELECTION SORT ==

You choose Selection Sort.

Current Minimum for [0]: 3. Look for a possible new minimum.
[0]: 3 > [1]: 2 ? TRUE. Change new current minimum from 3 to 2. Search the list again.
[1]: 2 > [2]: 0 ? TRUE. Change new current minimum from 2 to 0. Search the list again.
[2]: 0 > [3]: 9 ? FALSE. Current minimum 0 retain.
[2]: 0 > [4]: 1 ? FALSE. Current minimum 0 retain.
[2]: 0 > [5]: 4 ? FALSE. Current minimum 0 retain.
[2]: 0 > [6]: 7 ? FALSE. Current minimum 0 retain.
[2]: 0 > [7]: 8 ? FALSE. Current minimum 0 retain.
[2]: 0 > [8]: 5 ? FALSE. Current minimum 0 retain.
[2]: 0 > [9]: 6 ? FALSE. Current minimum 0 retain.
Reached the end of the list. Found new minimum. Swap [0]: 3 with [2]: 0.

Current Minimum for [1]: 2. Look for a possible new minimum.
[1]: 2 > [2]: 3 ? FALSE. Current minimum 2 retain.
[1]: 2 > [3]: 9 ? FALSE. Current minimum 2 retain.
[1]: 2 > [4]: 1 ? TRUE. Change new current minimum from 2 to 1. Search the list again.
[4]: 1 > [5]: 4 ? FALSE. Current minimum 1 retain.
[4]: 1 > [6]: 7 ? FALSE. Current minimum 1 retain.
[4]: 1 > [7]: 8 ? FALSE. Current minimum 1 retain.
[4]: 1 > [8]: 5 ? FALSE. Current minimum 1 retain.
[4]: 1 > [9]: 6 ? FALSE. Current minimum 1 retain.
Reached the end of the list. Found new minimum. Swap [1]: 2 with [4]: 1.

Current Minimum for [2]: 3. Look for a possible new minimum.
[2]: 3 > [3]: 9 ? FALSE. Current minimum 3 retain.
[2]: 3 > [4]: 2 ? TRUE. Change new current minimum from 3 to 2. Search the list again.
[4]: 2 > [5]: 4 ? FALSE. Current minimum 2 retain.
[4]: 2 > [6]: 7 ? FALSE. Current minimum 2 retain.
[4]: 2 > [7]: 8 ? FALSE. Current minimum 2 retain.
[4]: 2 > [8]: 5 ? FALSE. Current minimum 2 retain.
[4]: 2 > [9]: 6 ? FALSE. Current minimum 2 retain.
Reached the end of the list. Found new minimum. Swap [2]: 3 with [4]: 2.

Current Minimum for [3]: 9. Look for a possible new minimum.
[3]: 9 > [4]: 3 ? TRUE. Change new current minimum from 9 to 3. Search the list again.
[4]: 3 > [5]: 4 ? FALSE. Current minimum 3 retain.
[4]: 3 > [6]: 7 ? FALSE. Current minimum 3 retain.
[4]: 3 > [7]: 8 ? FALSE. Current minimum 3 retain.
[4]: 3 > [8]: 5 ? FALSE. Current minimum 3 retain.
[4]: 3 > [9]: 6 ? FALSE. Current minimum 3 retain.
Reached the end of the list. Found new minimum. Swap [3]: 9 with [4]: 3.

Current Minimum for [4]: 9. Look for a possible new minimum.
[4]: 9 > [5]: 4 ? TRUE. Change new current minimum from 9 to 4. Search the list again.
[5]: 4 > [6]: 7 ? FALSE. Current minimum 4 retain.
[5]: 4 > [7]: 8 ? FALSE. Current minimum 4 retain.
[5]: 4 > [8]: 5 ? FALSE. Current minimum 4 retain.
[5]: 4 > [9]: 6 ? FALSE. Current minimum 4 retain.
Reached the end of the list. Found new minimum. Swap [4]: 9 with [5]: 4.

Current Minimum for [5]: 9. Look for a possible new minimum.
[5]: 9 > [6]: 7 ? TRUE. Change new current minimum from 9 to 7. Search the list again.
[6]: 7 > [7]: 8 ? FALSE. Current minimum 7 retain.
[6]: 7 > [8]: 5 ? TRUE. Change new current minimum from 7 to 5. Search the list again.
[8]: 5 > [9]: 6 ? FALSE. Current minimum 5 retain.
Reached the end of the list. Found new minimum. Swap [5]: 9 with [8]: 5.

Current Minimum for [6]: 7. Look for a possible new minimum.
[6]: 7 > [7]: 8 ? FALSE. Current minimum 7 retain.
[6]: 7 > [8]: 9 ? FALSE. Current minimum 7 retain.
[6]: 7 > [9]: 6 ? TRUE. Change new current minimum from 7 to 6. Search the list again.
Reached the end of the list. Found new minimum. Swap [6]: 7 with [9]: 6.

Current Minimum for [7]: 8. Look for a possible new minimum.
[7]: 8 > [8]: 9 ? FALSE. Current minimum 8 retain.
[7]: 8 > [9]: 7 ? TRUE. Change new current minimum from 8 to 7. Search the list again.
Reached the end of the list. Found new minimum. Swap [7]: 8 with [9]: 7.

Current Minimum for [8]: 9. Look for a possible new minimum.
[8]: 9 > [9]: 8 ? TRUE. Change new current minimum from 9 to 8. Search the list again.
Reached the end of the list. Found new minimum. Swap [8]: 9 with [9]: 8.

Display sorted list: 0 1 2 3 4 5 6 7 8 9 
* 
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise7_InsertionSortSelectionSort {
	public Prelim_Exercise7_InsertionSortSelectionSort() {

        Scanner x = new Scanner (System.in);
        int[] stock = new int[10];
        int index1, index2, index3, cnt = 1, sorttype;
        boolean looper =  true, replace = false;
        
        for (index1=0;index1<stock.length;++index1) {
            cnt = index1 + 1;
            System.out.print("Enter number "+cnt+": ");
            stock[index1] = x.nextInt();
        }
        
        System.out.print("\nDisplay unsorted list: ");
        for (index1=0;index1<stock.length;++index1) {
            System.out.print(stock[index1]+" ");
        }
        
        cnt = 1;

        do {
            if (cnt==1) {
                cnt++;
                System.out.println("\n\n[1] Insertion Sort | [2] Selection Sort\n");
            }

            System.out.print("Choose which sort algorithm to be used: ");
            sorttype = x.nextInt();

            if (sorttype<1||sorttype>2) {
                System.out.print("Invalid Input! ");
                looper = true;
            } else {
                looper = false;
            }
        } while (looper==true);
        
        switch(sorttype) {
            case 1: // insertion sort

                int insert, shift, surfer;
                System.out.println("\nYou choose Insertion Sort.\n");
                index1 = 1;

                do {
                    insert = stock[index1];
                    System.out.println("Insert "+insert);
                    for (index2=index1-1;index2>=0;--index2) {
                        index3 = index2+1;
                        System.out.print("["+index3+"]: "+stock[index3]+" < ["+index2+"]: "+stock[index2]+" ? ");
                        if (stock[index3]<stock[index2]) {
                            System.out.println("TRUE. Shift "+stock[index2]+", insert "+stock[index3]+".");
                            insert = stock[index3];
                            shift = stock[index2];
                            stock[index3] = shift;
                            stock[index2] = insert;
                        } else {
                            System.out.println("FALSE. Location OK.");
                            index2 = 0;
                        }
                    }
                    if (index1<stock.length-1) {
                        System.out.print("Current sorted list: ");
                        for (index2=0;index2<=index1;++index2) {
                            System.out.print(stock[index2]+" ");
                        }                        
                    }
                    System.out.println("\n");
                    index1++;
                } while (index1<stock.length);

            break; // end of insertion sort
            
            case 2: // selection sort

                int minimum, minadd, tempsel, tempadd; //
                System.out.println("\nYou choose Selection Sort.\n");    

                for (index1=0;index1<stock.length-1;++index1) {
                    minimum = stock[index1];
                    minadd = index1;
                    tempsel = stock[index1];
                    tempadd = index1;
                    System.out.println("Current Minimum for ["+minadd+"]: "+minimum+". Look for a possible new minimum.");
                    for (index2=index1+1;index2<stock.length;++index2) {
                        System.out.print("["+tempadd+"]: "+tempsel+" > ["+index2+"]: "+stock[index2]+" ? ");
                        if (tempsel>stock[index2]) {
                            System.out.println("TRUE. Change new current minimum from "+tempsel+" to "+stock[index2]+". Search the list again.");
                            tempsel = stock[index2];
                            tempadd = index2;
                        } else {
                            System.out.println("FALSE. Current minimum "+tempsel+" retain.");
                        }
                    }
                   System.out.print("Reached the end of the list. ");
                   if (minimum==tempsel) {
                        System.out.println("Current Minimum is still the same. Retain.\n");
                   } else {
                        System.out.println("Found new minimum. Swap ["+minadd+"]: "+minimum+" with ["+tempadd+"]: "+tempsel+".\n");
                        stock[minadd] = tempsel;
                        stock[tempadd] = minimum;
                   }
                }

            break; // end of selection sort
        }

        System.out.print("Display sorted list: ");
        for (index1=0;index1<stock.length;++index1) {
            System.out.print(stock[index1]+" ");
        }

	}
}