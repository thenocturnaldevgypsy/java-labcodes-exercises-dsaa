/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 8 / Method using a specific returnValueType and the return statement
*/

import java.*;
import java.util.Scanner;

public class Prelim_Method_ReturnDemo {
	public Prelim_Method_ReturnDemo() {
        Scanner x = new Scanner (System.in);
        int num1, num2, result;
        
        System.out.println("Enter 2 numbers");
        num1 = x.nextInt();
        num2 = x.nextInt();
        result = AddNum(num1, num2);
        System.out.print(result);
    }
    
    public static int AddNum (int num1, int num2) {
        int added = num1 + num2;
        return added;
    }
}