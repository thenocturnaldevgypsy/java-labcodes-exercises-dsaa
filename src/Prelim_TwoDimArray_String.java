/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 5
*/

import java.*;

public class Prelim_TwoDimArray_String {
	public Prelim_TwoDimArray_String() {
        String [][] drinks = {{"coffee", "120.00"},
                {"mojito", "150.00"},
                {"tequila", "120.00"},
                {"mocha", "110.00"},
                {"water", "50.00"}};                                            
		int x, y;
		
		for (y=0; y<=1; ++y) {
			for (x=0; x<=4; ++x) {
				System.out.println("drinks ["+ x +"][" + y + "] value = " + drinks[x][y]);
			}
		}
	}
}