/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Midterm
 * Activity # 4
*/

import java.*;
import java.util.*;

public class Prefinal_LinkedList_Queue {
	public Prefinal_LinkedList_Queue() {
    	Scanner x = new Scanner (System.in);
    	String input;
        LinkedList name = new LinkedList();
        int trigger, counter=1, cntEnqueue=0, loop=1;

		System.out.print("This program will demonstrate how to represent Queue in Singly-Linked List.\n\n");

		do {
			System.out.print("What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? ");
			trigger = x.nextInt();
			switch (trigger) {
				case 1:
					System.out.print("\nENQUEUE ["+cntEnqueue+"]: ");
					input = x.next();
					name.add(input);
					System.out.print(input+" Enqueued at ["+cntEnqueue+"]");
					break;
				case 2:
					//ll.remove(2);
				case 3:
					Object val = name.get(0);
            		String convert = (String) val;
				    System.out.print("PEEK: "+convert);
					break;
				default:
				    loop = 0;
			}

		} while (loop == 1);
	}
}