/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Midterm
 * Exercise # 3 : Queue with One Dimensional Array
  * 
 * Expected Output:
 * 
Create a Java program (REQUIREMENT: Use a one dimensional array for storing the information) with the following requirements/output:

This program will demonstrate how to represent Queue in One-Dimensional Array.

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 1

ENQUEUE [0]: abby
abby Enqueued at [0]

= Current content of the Queue =
[2] :  
[1] :  
[0] : abby

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 1

ENQUEUE [1]: jeff
jeff Enqueued at [1]

= Current content of the Queue =
[2] :  
[1] : jeff
[0] : abby

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 1

ENQUEUE [2]: jacob
jacob Enqueued at [2]

= Current content of the Queue =
[2] : jacob
[1] : jeff
[0] : abby

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 3
PEEK: abby

= Current content of the Queue =
[2] : jacob
[1] : jeff
[0] : abby

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 2

DEQUEUE [abby]

= Current content of the Queue =
[2] :  
[1] : jacob
[0] : jeff

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 2

DEQUEUE [jeff]

= Current content of the Queue =
[2] :  
[1] :  
[0] : jacob

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 2

DEQUEUE [jacob]

= Current content of the Queue =
[2] :  
[1] :  
[0] :  

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 4

= Current content of the Queue =
[2] :  
[1] :  
[0] :  

Process completed.
 * 
*/

import java.*;
import java.util.Scanner;

public class Midterm_Exercise3_OneDimArray_Queue {
	public Midterm_Exercise3_OneDimArray_Queue () {

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