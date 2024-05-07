/*
* Course: Data Structure and Algorithm Analysis
* Period: Prelim
* Group Activity # 2
*/

import java.*;
import java.util.Scanner;

public class Prelim_LinearBinarySearch {
	public Prelim_LinearBinarySearch() {
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