/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Group Activity # 1
*/

import java.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Prelim_Array_FacRate {
	public Prelim_Array_FacRate() {
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