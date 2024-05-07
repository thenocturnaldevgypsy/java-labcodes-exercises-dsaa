/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 8 : All operations using Methods
 * 
 * Expected Output:
 * 
Enter 2 numbers
7
3

7 + 3 = 10
7 - 3 = 4
7 x 3 = 21
7 / 3 = 2.0

Condition: Each operation (addition, subtraction, multiplication and division) must be coded and perfomed in separate methods, meaning you must have one void main and four methods in your program (one java method for addition, one java method for subtraction, one java method for multiplication and one java method for division).
 * 
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise8_Method_Operations {

    public Prelim_Exercise8_Method_Operations () {     
        Scanner x = new Scanner (System.in);
        int num1, num2, add, sub, mul;
        double  div;
        
        System.out.println("Enter 2 numbers");
        num1 = x.nextInt();
        num2 = x.nextInt();
        add = AddNum(num1, num2);
        sub = SubNum(num1, num2);
        mul = MulNum(num1, num2);
        div = DivNum(num1, num2);
        System.out.println();
        System.out.println(num1+" + "+num2+" = "+add);
        System.out.println(num1+" - "+num2+" = "+sub);
        System.out.println(num1+" x "+num2+" = "+mul);
        System.out.print(num1+" / "+num2+" = "+div);
    }
    
    public static int AddNum (int num1, int num2) {
        int add = num1 + num2;
        return add;
    }
    
    public static int SubNum (int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }
    
    public static int MulNum (int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }
    
    public static double DivNum (int num1, int num2) {
        double div = num1 / num2;
        return div;
    }

}