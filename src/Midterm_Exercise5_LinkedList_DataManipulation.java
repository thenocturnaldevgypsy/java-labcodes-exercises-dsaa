/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Midterm
 * Exercise # 5 : Data Manipulation with Linked List
 * 
 * Expected Output:
 * 
Create a Java program with the following requirements/output:

Enter name to be added in our Linked List: Anna
Add new record to our linked list [1-Yes|0-No] ? 1
Enter name to be added in our Linked List: Karen
Add new record to our linked list [1-Yes|0-No] ? 1
Enter name to be added in our Linked List: Nina
Add new record to our linked list [1-Yes|0-No] ? 1
Enter name to be added in our Linked List: Paulo
Add new record to our linked list [1-Yes|0-No] ? 1
Enter name to be added in our Linked List: Renz
Add new record to our linked list [1-Yes|0-No] ? 0

Let's show the records stored in our linked list [Anna, Karen, Nina, Paulo, Renz]

Type in the name that you want to search: Karen
> Is [0]: Anna == Karen? FALSE
> Is [1]: Karen == Karen? TRUE, stored at [1]

What do you want to do [1-Update|2-Delete] ? 2

Updated records stored in our linked list [Anna, Nina, Paulo, Renz]

Type in the name that you want to search: Anna
> Is [0]: Anna == Anna? TRUE, stored at [0]

What do you want to do [1-Update|2-Delete] ? 1
New name to be stored: Kuracha

Updated records stored in our linked list [Kuracha, Nina, Paulo, Renz]

Condition: The program will only stop asking for the value to be searched and perform update/delete in the linked list if there is no more existing nodes (if all of the nodes are deleted).
 * 
*/

import java.util.LinkedList;
import java.util.Scanner;

public class Midterm_Exercise5_LinkedList_DataManipulation {
	public Midterm_Exercise5_LinkedList_DataManipulation () {

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        int choice;
        do {
            System.out.print("Enter name to be added in our Linked List: ");
            String name = scanner.nextLine();
            list.add(name);

            System.out.print("Add new record to our linked list [1-Yes|0-No] ? ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        } while (choice == 1);

        System.out.print("\nLet's show the records stored in our linked list ");
        System.out.println(list);

        int searchChoice;
        do {
            System.out.print("\nType in the name that you want to search: ");
            String searchName = scanner.nextLine();
            int index = list.indexOf(searchName);

            if (index != -1) {
                System.out.println("> Is [" + index + "]: " + list.get(index) + " == " + searchName + "? TRUE, stored at [" + index + "]");
                System.out.print("\nWhat do you want to do [1-Update|2-Delete] ? ");
                int actionChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (actionChoice == 2) {
                    list.remove(index);
                } else if (actionChoice == 1) {
                    System.out.print("New name to be stored: ");
                    String newName = scanner.nextLine();
                    list.set(index, newName);
                }
            } else {
                System.out.println("> Is [" + searchName + "]: NOT FOUND");
            }

            System.out.print("\nUpdated records stored in our linked list ");
            System.out.println(list);

            // Check if all nodes are deleted
            if (list.isEmpty()) {
                System.out.println("\nAll records are deleted. Exiting program...");
                break;
            }

            System.out.print("\nContinue searching and modifying records [1-Yes|0-No] ? ");
            searchChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        } while (searchChoice == 1);

        //scanner.close();
		
	}
}