/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo Code # 2
*/
 
import java.*;

public class Prelim_OneDimArray_Debug {
	public Prelim_OneDimArray_Debug() {
        double[] array = {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};
        double total = 0.0;        
        for (int index=0;index<array.length;index++) {
            System.out.println("Total initial value: " + total);
            total = total + array[index];
            System.out.println("Total after value: " + total);
        }        
        System.out.println("The total is: " + total);
	}
}