/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Activity # 4
*/

import java.*;
import java.util.Scanner;

public class Prelim_BubbleSort {
	public Prelim_BubbleSort() {

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