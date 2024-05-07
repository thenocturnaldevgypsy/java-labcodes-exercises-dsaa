/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Activity # 10
*/

import java.*;
import java.util.*;

public class Midterm_Stack_DecimalConversion {
	public Midterm_Stack_DecimalConversion() {
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