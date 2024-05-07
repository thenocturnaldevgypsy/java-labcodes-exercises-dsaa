/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Prelim
 * Exercise # 1 : Java Refresher
 * 
 * Expected Output:
 * 
Hi, what's your name: <name>
Hello <name>, nice to meet you, how old are you? <age>
-  If 20 and above: Eww, too old...
-  Else: So young
Give me anumber at mag-mamagic ako: <number> e.g. 4
Magic Box:
****
****
****
****
Isa pa, magic tatsulok!
*
**
***
****
Kaya mo pa? <oo/yes> or <hinde/no>
-  Yes/Oo: Good
-  No/Hindi: Gutom lang yan.
Nice meeting you <name>, sa uulitin!
 * 
*/

import java.*;
import java.util.Scanner;

public class Prelim_Exercise1_JavaRefresher {
	public Prelim_Exercise1_JavaRefresher() {

        Scanner x = new Scanner (System.in);
        int age, magic;
        String name, answer;
        
        System.out.print("Hello, what's your name? ");
        name = x.next();
        System.out.print("Hi " + name + ", how old are you? ");
        age = x.nextInt();
        
        if (age >= 20) {
            System.out.print("Eww, to old... ");
        } else {
            System.out.print("So young... ");
        }
        
        System.out.print("Give me a number at magmamagic ako: ");
        magic = x.nextInt();
        
        System.out.println("Magic Box!");
        for (int rowb=0;rowb<magic;rowb++) {
            for (int colb=0;colb<magic;colb++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("Isa pa, mahiwagang tatsulok!");
        int countri = 1;

        for (int rowt=0;rowt<magic;rowt++) {

            for (int colt=0;colt<countri;colt++) {
                System.out.print("* ");
            }

        countri++;
        System.out.println();
        }
        
        System.out.print("Kaya mo pa ba? ");
        answer = x.next();
        
        switch (answer) {
            case "yes":
            case "oo":
                System.out.print("Good! ");
            break;
            case "no":
            case "hindi":
                System.out.print("Gutom lang yan! ");
            break;
        }        

        System.out.print("Nice meeting you "+ name +", sa uulitin!");		

	}
}