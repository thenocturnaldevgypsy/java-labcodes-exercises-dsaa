/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 4
*/

import java.*;

public class Prelim_TwoDimArray_Demo {
	public Prelim_TwoDimArray_Demo() {
        int [][] array = new int[3][3];
        int x, y;
        
        for (y=0; y<=2; ++y) {
            for (x=0; x<=2; ++x) {
                array[x][y] = (y+1) * (x+1);
                System.out.println("array ["+ x +"][" + y + "] value = " + array[x][y]);
            }
        }
	}
}