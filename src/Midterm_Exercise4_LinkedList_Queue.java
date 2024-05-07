/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Midterm
 * Exercise # 4 : Queue with Linked List
 * 
 * Expected Output:
 * 
Create a Java program (REQUIREMENT: Use a linked list for storing the information) with the following requirements/output:

This program will demonstrate how to represent Queue in Linked List.

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 1

ENQUEUE [0]: abby
abby Enqueued at [0]

Current content of the Queue [abby]

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 1

ENQUEUE [1]: jeff
jeff Enqueued at [1]

Current content of the Queue [abby, jeff]

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 1

ENQUEUE [2]: jacob
jacob Enqueued at [2]

Current content of the Queue [abby, jeff, jacob]

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 3

PEEK: abby

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 2

DEQUEUE [abby]

Current content of the Queue [jeff, jacob]

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 2

DEQUEUE [jeff]

Current content of the Queue [jacob]

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 2

DEQUEUE [jacob]

Current content of the Queue []

What do you want to do [1-Enqueue|2-Dequeue|3-Peek|4-Quit]? 4

Current content of the Queue []

Process completed.
 * 
*/

import java.*;
import java.util.*;

public class Midterm_Exercise4_LinkedList_Queue {
	public Midterm_Exercise4_LinkedList_Queue () {

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