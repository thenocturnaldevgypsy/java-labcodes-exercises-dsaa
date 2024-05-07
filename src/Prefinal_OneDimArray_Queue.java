/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Midterm
 * Activity # 3
*/

import java.*;
import java.util.Scanner;

public class Prefinal_OneDimArray_Queue {
	public Prefinal_OneDimArray_Queue() {
		Scanner x = new Scanner (System.in);
		String[] name = new String [3];
		name[0] = " ";
        name[1] = " ";
        name[2] = " ";
        
		int trigger, cntEnqueue=0, loop=1;
		System.out.print("This program will demonstrate how to represent Queue in One-Dimensional Array.\n\n");

		do {
			System.out.print("What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? ");
			trigger = x.nextInt();
			switch (trigger) {
				case 1:
                    if (cntEnqueue == name.length) {
						System.out.print("ERROR: Queue already FULL.");
					} else {
                        System.out.print("\nENQUEUE ["+cntEnqueue+"]: ");
                        name[cntEnqueue] = x.next();
                        System.out.print(name[cntEnqueue]+" Enqueued at ["+cntEnqueue+"]");
                        cntEnqueue++;
					}
					break;
				case 2:
                    System.out.print("\nDEQUEUE ["+name[0]+"]");
                    for (int cnt=1;cnt<name.length;cnt++) {
                        name[cnt-1] = name[cnt];
                        name[cnt] = " ";
                    }
                    if (cntEnqueue != 0) {
                        cntEnqueue--;
                    }
					break;
				case 3:
				    System.out.print("PEEK: "+name[0]);
					break;
				default:
				    loop = 0;
			}
			System.out.println("\n");
			System.out.println("= Current content of the Queue =");
			for (int cnt=name.length-1;cnt>=0;cnt--) {
			    System.out.println("["+cnt+"] : "+name[cnt]);
			}
            System.out.println();
		} while (loop == 1);
	}
}