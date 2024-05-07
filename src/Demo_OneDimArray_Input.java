/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Demo # 3 : One Dimensional Array - Input 
*/
 
import java.*;
import java.util.Scanner;

public class Demo_OneDimArray_Input {
	public Demo_OneDimArray_Input() {

        Scanner scan = new Scanner (System.in);
        int [] array = new int[5];
        int data;        
        
        for ( int index=0; index < array.length; index++) {
            System.out.print("Enter an integer: ");
            data = scan.nextInt();
            array[index] = data;
        }
        
        for (int index=0;index < array.length;index++) {
            System.out.println("array[ " + index + " ] = " + array[ index ]);
        }	

	}
}