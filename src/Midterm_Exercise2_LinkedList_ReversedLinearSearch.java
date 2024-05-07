/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Midterm
 * Exercise # 2 : Reversed Linear Search using Linked List
 * 
 * Expected Output:
 * 
Enter name to be added in our Linked List: Anna
Add new record to our linked list [1-Yes|0-No] ? 1
Enter name to be added in our Linked List: Karen
Add new record to our linked list [1-Yes|0-No] ? 1
Enter name to be added in our Linked List: Nina
Add new record to our linked list [1-Yes|0-No] ? 0

Let's show the records stored in our linked list [Anna, Karen, Nina]

Type in the name that you want to search: Anna
> Is [2]: Nina == Anna? FALSE
> Is [1]: Karen == Anna? FALSE
> Is [0]: Anna == Anna? TRUE, stored at [1]
 * 
*/

import java.*;
import java.util.*;

public class Midterm_Exercise2_LinkedList_ReversedLinearSearch {
	public Midterm_Exercise2_LinkedList_ReversedLinearSearch () {

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