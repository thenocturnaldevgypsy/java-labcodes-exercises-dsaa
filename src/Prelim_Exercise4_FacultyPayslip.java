/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 4 : Faculty Listing, Type, Rate and Salary using multiple one dimensional arrays
 * 
 * Expected Output:
 * 
1. Your program should have the 3 following single/one dimensional array:

String[] facultyname = new String[5];
String[] facultytype = new String[5];
double[] facultyrate = new double[5];

2. The user will be prompted to enter five (5) faculty records.

Example:

Faculty Name: Abby Nucup
Faculty Type (FT=Full Time/PT=Part Time): FT
Faculty Rate: 150.00

Make sure that the following information must be stored to their respective arrays.

Faculty Name must be stored in facultyname 
Faculty Type must be stored in facultytype
Faculty Rate must be stored in facultyrate

3. After inputting and storing the five records, the program will ask for the array index number of the record he/she want to use. Note that the only allowed numbers to be inputted must range from 0 to 4. Numbers 5 and above are no longer allowed. If the is valid, you must get/retrieve the name and type information stored in the respective array element using the index as tracker.

Example:

Enter record number: 5
Invalid number!
Enter record number: 3

Faculty Name: Nicanor Gustavo
Faculty Type: FT

4. After retrieving the information, the user must input either the number of hours or day. If the faculty is a FT (Full Time), then it should ask for the "Number of Days". If the faculty is a PT (Part Time), then it should ask for the "Number of Hours".

Ex. if FT:

Enter Number of Days: 5

Ex. if PT:

Enter Number of Hours: 8

5. For computing the salary, you must use the following formulas:

FT Formula:

salary = (facultyrate x 8 hours) x Number of Days

double salary = (facultyrate[index] * 8) * numberinputted

PT:

salary = facultyrate x Number of Hours

double salary = facultyrate[index] * numberinputted

6. After inputting the salary, the final output should be:

=For FT=

Salary Report
Faculty Name: Nicanor Gustavo
Faculty Type: FT
Rate: 150.00
Number of Days: 10
Salary: 12,000.00

=For PT=

Salary Report
Faculty Name: Nicanor Gustavo
Faculty Type: PT
Rate: 150.00
Number of Hours: 10
Salary: 1,500.00
 * 
*/

import java.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Prelim_Exercise4_FacultyPayslip {
	public Prelim_Exercise4_FacultyPayslip() {

        Scanner x = new Scanner (System.in);
        String[] facultyname = new String[5];
        String[] facultytype = new String[5];
        double[] facultyrate = new double[5];
        NumberFormat deci = new DecimalFormat("#0.00");
        
        int search, loop, numberof;
        String name, ftype, ftfull;
        double frate, rate, salary;
        
        for (loop=0;loop<=4;loop++) {
            System.out.print("Enter Faculty Name (Firstname Lastname): ");
            name =  x.nextLine();
            facultyname[loop] = name;
        }

        System.out.println();
        
        for (loop=0;loop<=4;loop++) {
            System.out.print("Enter Faculty Type [FT-Full Time/PT-Part Time]: ");
            ftype =  x.next();
            facultytype[loop] = ftype.toUpperCase();
        }

        System.out.println();
        
        for (loop=0;loop<=4;loop++) {
            System.out.print("Enter Faculty Rate [000.00]: ");
            frate = x.nextDouble();
            facultyrate[loop] = frate;
        }

        System.out.println();
        
        loop = 1;

        do {
            System.out.print("Enter the array index of the record [0~4] : ");
            search = x.nextInt();
            if (search>4) {
                 System.out.print("Invalid Input! ");
                 loop = 1;
            } else {
                loop = 0;
            }
        } while (loop==1);
        
        System.out.println();
        System.out.println("Faculty Name: "+facultyname[search]);
        System.out.println("Faculty Type: "+facultytype[search]+"\n");
        rate = facultyrate[search];
        
        if (facultytype[search].equals("FT")) {
            System.out.print("Enter number of Days: ");
            ftfull = "[FT] Full Time";
        } else {
            System.out.print("Enter number of Hours: ");
            ftfull = "[PT] Part Time";       
        }

        numberof = x.nextInt();
        
        if (facultytype[search].equals("FT")) {
            salary = (rate * 8) * numberof;
        } else {
            salary = rate * numberof;
        }
        
        System.out.println();
        System.out.println("Salary Report");
        System.out.println("Faculty Name: "+facultyname[search]);
        System.out.println("Faculty Type: "+ftfull+"\n");
        System.out.println("Faculty Rate: "+facultyrate[search]);
        System.out.println("Salary: "+deci.format(salary));	
        
	}
}