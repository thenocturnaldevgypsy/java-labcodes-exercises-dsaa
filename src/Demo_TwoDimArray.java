/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo # 4 : Two Dimensional Array 
*/

import java.*;

public class Demo_TwoDimArray {
	public Demo_TwoDimArray() {

        int [][] twoArray = new int[3][3];
        int x, y;
        
        for (y=0; y<=2; ++y) {
            for (x=0; x<=2; ++x) {
                twoArray[x][y] = (y+1) * (x+1);
                System.out.println("Two Dimensional Array -twoArray- ["+ x +"][" + y + "] value = " + twoArray[x][y]);
            }
        }

	}
}