/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 7 / Method using void
*/

import java.*;
import java.util.Scanner;

public class Prelim_Method_Demo {
	public Prelim_Method_Demo() {
        Scanner x = new Scanner (System.in);
        int num, cnt = 1;
        
        System.out.print("Enter a number: ");
        num = x.nextInt();
        
        do {
            Mul(num, cnt);
            cnt++;
        } while (cnt!=11);        
    }
    
    public static void Mul (int catcher, int multip) {
        int prod = catcher * multip;
        System.out.println(prod);
    }
}