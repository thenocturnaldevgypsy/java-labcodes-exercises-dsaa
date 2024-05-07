/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Midterm
 * Activity # 2
*/

import java.*;
import java.util.*;

public class Midterm_LinkedList_ReversedLinearSearch {
	public Midterm_LinkedList_ReversedLinearSearch() {
        int add = 1, counter = 0, loop = 0;
        String input;
        boolean found = false;
        Scanner x = new Scanner (System.in);
        LinkedList sample = new LinkedList();

        do { // to add new record in our linked list
            System.out.print("Enter name to be added in our Linked List: ");
            input = x.next();
            sample.add(input);
            System.out.print("Add new record to our linked list [1-Yes|0-No] ?");
            add = x.nextInt();
            counter++;
        } while (add==1);

        System.out.println("\nLet's show the records stored in our linked list "+sample+"\n");
        System.out.print("Type in the name that you want to search: ");
        String search = x.next();

        loop = counter - 1;
        do {
            Object val = sample.get(loop);
            String convert = (String) val;
            System.out.print("> Is ["+loop+"]: "+convert+" == "+search+"? ");
            if (convert.equalsIgnoreCase(search)) {
                System.out.print("TRUE, stored at ["+loop+"]");
                found = true;
                loop = -1;
            } else {
                System.out.println("FALSE");
                loop--;
            }
        } while (loop != -1);

        if (found == false && loop == -1) {
            System.out.print("VALUE NOT EXISTING");
        }
	}
}