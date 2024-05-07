/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo # 1 : One Dimensional Array
*/

import java.*;

public class Demo_OneDimArray {
	public Demo_OneDimArray() {
		
        int[] container = new int[5];
        int aSize = container.length;   
        
        //predefined array content value
        container[0] = 23;
        container[1] = 38;
        container[4] = 7 * 2;       
            
        System.out.println("Array container[0] has " + container[0]);
        System.out.println("Array container[1] has " + container[1]);
        System.out.println("Array container[2] has " + container[2]);
        System.out.println("Array container[3] has " + container[3]);
        System.out.println("Array container[4] has " + container[4]);
        System.out.println("Array container size: " + aSize);
        
	}
}