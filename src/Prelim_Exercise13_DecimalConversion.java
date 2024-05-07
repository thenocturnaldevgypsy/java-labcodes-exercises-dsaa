/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 13 : All numeric conversion using Stack and multiple methods
 * 
 * Expected Output:
 * 
Enter a decimal number: 10
Binary: 1010
Octal: 12
Hexadecimal: A

Condition: You must use stack and the .push() and .pop() methods in this program. You must have a separate method for the following:

- from Decimal to Binary
- from Decimal to Octal
- from Decimal to Hexadecimal

This means you have one static void main and three customed methods in your program.
 * 
*/

import java.*;
import java.util.*;

public class Prelim_Exercise13_DecimalConversion {

	public Prelim_Exercise13_DecimalConversion() {
        Scanner input = new Scanner (System.in);
        int num;
        
        System.out.print("Enter a decimal number: ");
        num = input.nextInt();
        
        toBinary(num);
        System.out.println();
        toOctal(num);
        System.out.println();
        toHexa(num);        
    }
    
    public static void toBinary (int num) {
        Stack s = new Stack();
        int remainder;
        
        do {
            remainder = num%2;
            s.push(remainder);
            num = num/2;
        } while(num!=0);

        System.out.print("Binary: ");
        while (!s.empty()){
            System.out.print(s.pop());
        }       
    }
    
    public static void toOctal (int num) {
        Stack s = new Stack();
        int remainder;
        
        do {
            remainder = num%8;
            s.push(remainder);
            num = num/8;
        } while (num!=0);
        
        System.out.print("Octal: ");
        while (!s.empty()){
            System.out.print(s.pop());
        }       
    }
    
    public static void toHexa (int num) {
        Stack s = new Stack();
        int remainder;
        
        do {
            remainder = num%16;
            switch (remainder){
                case 10:
                    s.push("A");
                    break;
                case 11:
                    s.push("B");
                    break;
                case 12:
                    s.push("C");
                    break;
                case 13:
                    s.push("D");
                    break;
                case 14:
                    s.push("E");
                    break;
                case 15:
                    s.push("F");
                    break;
                default:
                    s.push(remainder);
            }
            num = num/16;
        } while (num!=0);       
        
        System.out.print("Hexadecimal: ");
        while (!s.empty()){
            System.out.print(s.pop());
        }       
    }
    
}