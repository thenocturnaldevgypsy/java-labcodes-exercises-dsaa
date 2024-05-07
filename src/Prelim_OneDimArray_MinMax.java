/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Activity # 2
*/

import java.*;
import java.util.Scanner;

public class Prelim_OneDimArray_MinMax {
	public Prelim_OneDimArray_MinMax() {

        Scanner x = new Scanner (System.in);
        int[] values = new int[10];
        int min, minloc, max, maxloc, sum = 0, cnt;
        double ave;
        
        for (cnt=0;cnt<values.length;++cnt) {
            System.out.print("Enter a number for ["+cnt+"]: ");
            values[cnt] = x.nextInt();
        }
        
        min = values[0];
        minloc = 0;
        max = values[0];
        maxloc = 0;
        
        for (cnt=0;cnt<values.length;++cnt) {
            if (values[cnt]<min) {
                min = values[cnt];
                minloc = cnt;
            }
            if (values[cnt]>max) {
                max = values[cnt];
                maxloc = cnt;
            }
            sum = sum + values[cnt];
        }
        
        ave = sum / 10;
        
        System.out.println("\nThe mimimum is "+min+", stored at ["+minloc+"]");
        System.out.println("The maximum is "+max+", stored at ["+maxloc+"]");
        System.out.print("The average is "+ave);
		
	}

}