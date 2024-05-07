/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 10
*/

import java.*;
import java.util.Stack;
import java.util.Scanner;

public class Midterm_Stack_Demo {
	public Midterm_Stack_Demo() {
        Scanner x = new Scanner (System.in);
        Stack sample = new Stack();
        
        System.out.print("Number of items to be pushed: ");
        int count = x.nextInt();        
                
        for (int z=1;z<=count;z++) {
            System.out.print("Enter number for item ["+z+"]: ");
            int type = x.nextInt();
            sample.push(type);
        }
        
        System.out.println("Stack size: "+sample.size());
        System.out.println("Current TOP in our stack using peek: "+sample.peek());
        
        System.out.print("Let's pop all the items from top to bottom: ");
        do {
            System.out.print(sample.pop()+" ");
        } while (!sample.empty());
	}
}