/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 10 : Triangular Number using Method
 * 
 * Expected Output:
 * 
Enter a number: 6

*
**
***
****
*****
******

The triangular number of 6 is 21.

Condition: The generation of the asterisk and computing the triangular number must be coded and perfomed in methods, meaning you must have one void main and two methods in your program (one java method for generating the asterisk of the triangular number and one method for computing the triangular number).
 * 
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise10_Method_TriangularNumber {

	public Prelim_Exercise10_Method_TriangularNumber() {
        Scanner sn = new Scanner (System.in);
        int num;
        boolean validate, triangular;
        
        System.out.print("Enter a number: ");
        num = sn.nextInt();
        System.out.println();
        TriNumGraph(num);
        System.out.println();
        int tnum = TriNum(num);
        System.out.print("The triangular number of " +num+ " is " + tnum);
    }
    
    public static void TriNumGraph (int num) {
        int countri = 1;
        for (int rowt=0;rowt<num;rowt++) {
            for (int colt=0;colt<countri;colt++) {
                System.out.print("* ");
            }
        countri++;
        System.out.println();
        }
    }
    
    public static int TriNum (int num) {
        int countri = 1, astk = 0;
        for (int rowt=0;rowt<num;rowt++) {
            for (int colt=0;colt<countri;colt++) {
                astk++;
            }
        countri++;
        }
        return astk;
    }
    
}