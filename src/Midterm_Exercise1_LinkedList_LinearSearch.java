/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Midterm
 * Exercise # 1 : Linear Search using Linked List
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

Type in the name that you want to search: Karen
> Is [0]: Anna == Karen? FALSE
> Is [1]: Karen == Karen? TRUE, stored at [1]
 * 
*/

import java.*;
import java.util.Scanner;
import java.util.LinkedList;

public class Midterm_Exercise1_LinkedList_LinearSearch {
	public Midterm_Exercise1_LinkedList_LinearSearch() {

        int add = 1, counter = 0, loop = 0;
        String input;
        boolean found = false;
        Scanner x = new Scanner (System.in);
        LinkedList sample = new LinkedList();
                
        do { // to add new record in our linked list
            System.out.print("Enter name to be added in our Linked List: ");
            input = x.next();
            sample.add(input);
            System.out.print("Add new record to our linked list [1-Yes|0-No] ? ");
            add = x.nextInt();
            counter++;
        } while (add==1);
        
        System.out.println("\nLet's show the records stored in our linked list "+sample+"\n");        
        System.out.print("Type in the name that you want to search: ");
        String search = x.next();
        
        do{
            Object val = sample.get(loop);
            String convert = (String) val;
            System.out.print("> Is ["+loop+"]: "+convert+" == "+search+"? ");
            if (convert.equalsIgnoreCase(search)) {
                System.out.print("TRUE, stored at ["+loop+"]");
                loop = counter;
                found = true;
            } else {
                System.out.println("FALSE");
                loop++;
            }
        } while (loop != counter);
        
        if (found == false && loop == counter) {
            System.out.print("VALUE NOT EXISTING");
        }
        
	}
}