/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 9 // Method using void in the returnValueType
*/

import java.*;
import java.util.Scanner;

public class Prelim_Method_VoidDemo {
	public Prelim_Method_VoidDemo() {
        Scanner x = new Scanner (System.in);
        String name;
        System.out.print("Hi! What's your name? ");
        name = x.next();
        RetName(name);
    }
    
    public static void RetName (String name) {
        System.out.print("Hi " +name+ ", nice to meet you!");
    }
}