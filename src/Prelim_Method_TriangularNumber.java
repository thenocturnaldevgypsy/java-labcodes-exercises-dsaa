/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Activity # 7
*/

import java.*;
import java.util.Scanner;

public class Prelim_Method_TriangularNumber {
	public Prelim_Method_TriangularNumber() {
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