/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Pre-final
 * Exercise # 1: Trees
 * 
 * Expected Output:
 * 
Create a Java program with the following requirements: 

REQUIREMENTS: use one dimensional array for storing the values in the tree. Note of the assigned array index for each level:
 
int[] array = new int[15]; 

Level 1: array[0]
Level 2: array[1], array[2]
Level 3: array[3], array[4], array[5], array[6]
level 4: array[7], array[8], array[9], array[10], array[11], array[12], array[13], array[14]

Skip the delete option at the moment.
 

Output:

Current nodes of the tree:

*show the updated triangular shape of the tree here*

[1-Insert|2-Find|3-Delete|4-Inorder Traversal|5-Preorder Traversal|6-Postorder Traversal|7-Quit]
What do you want to do? 1

Value to be inserted: 45

Current nodes of the tree:

*show the updated triangular shape of the tree here*

[1-Insert|2-Find|3-Delete|4-Inorder Traversal|5-Preorder Traversal|6-Postorder Traversal|7-Quit]
What do you want to do? 2

Search for: 45

45 is stored at Level 3.

[1-Insert|2-Find|3-Delete|4-Inorder Traversal|5-Preorder Traversal|6-Postorder Traversal|7-Quit]
What do you want to do? 4

Inorder Traversal: 30 40 45 50 55 60 80

[1-Insert|2-Find|3-Delete|4-Inorder Traversal|5-Preorder Traversal|6-Postorder Traversal|7-Quit]
What do you want to do? 5

Preorder Traversal: 50 40 30 45 60 55 80

[1-Insert|2-Find|3-Delete|4-Inorder Traversal|5-Preorder Traversal|6-Postorder Traversal|7-Quit]
What do you want to do? 6

Postorder Traversal: 30 45 40 55 80 60 50

[1-Insert|2-Find|3-Delete|4-Inorder Traversal|5-Preorder Traversal|6-Postorder Traversal|7-Quit]
What do you want to do? 7

Current nodes of the tree:

*show the updated triangular shape of the tree here*

Process Complete.
 * 
*/

import java.*;
import java.util.Scanner;

public class Prefinal_Exercise1_Trees {
	public Prefinal_Exercise1_Trees () {
		Scanner x = new Scanner (System.in);
		int[] tree = new int[15];
		int decision = 0, inTree =0, seeTree = 0;

		do {

			System.out.print("\nWhat do you want to do [1 - 7]? ");
			decision = x.nextInt();

			switch (decision) {
				case 1:

//					int inTree;
//					boolean validate =  true;
//					do {
//						System.out.print("Insert: ");
//						inTree = x.nextInt();
//						for (int b=0;b<tree.length;b++) {
//							if (tree[b]==inTree) {
//								System.out.print("Value already existing. ");
//								validate = true;
//							}
//						}
//					} while (validate != false);

					System.out.print("Insert: ");
					inTree = x.nextInt();
					if (tree[0] == 0) { // check if root node is not yet taken
						tree[0] =  inTree;
					} else { //root node taken, proceed with comparing
						if (inTree < tree[0]) { // if less root node, go left
							if (tree[1] == 0) { // if root node left child empty
								tree[1] = inTree;
							} else { //tree[1] is occupied, proceed with comparing
								if (inTree < tree[1]) { //if less tree[1], go left
									if (tree[3] == 0) {
										tree[3] = inTree;
									} else {
									}
								} else { //if greater than tree[1], go right
									if (tree[4] == 0) {
										tree[4] = inTree;
									} else {
									}
								}
							}
						} else { // if greater than root node, go right
							if (tree[2] == 0) { // if root node right child empty
								tree[2] = inTree;
							}
						}
					}
					break;
				case 2:
					System.out.print("Search for: ");
					seeTree = x.nextInt();
					boolean found = false;
					for (int a=0;a<tree.length;a++) {
						if (seeTree == tree[a]) {
							found = true;
							switch (a) { //check range
								case 0: //level 1
									System.out.println("\n"+seeTree+" is located at Level 1");
									break;
								case 1: case 2: //level 2
									System.out.println("\n"+seeTree+" is located at Level 2");
									break;
								case 3: case 4: case 5: case 6: //level 3
									System.out.println("\n"+seeTree+" is located at Level 3");
									break;
								default: // level 4
									System.out.println("\n"+seeTree+" is located at Level 4");
							}
						}
					}
					if (found == false) { //value not found
						System.out.println("Value does not exist!");
					}
					break;
			}

			System.out.println("\nUpdated content of the Tree:\n");
			System.out.println("                     "+tree[0]);
			System.out.println("         "+tree[1]+"                       "+tree[2]);
			System.out.println("   "+tree[3]+"           "+tree[4]+"           "+tree[5]+"           "+tree[6]);
			System.out.println(tree[7]+"     "+tree[8]+"     "+tree[9]+"     "+tree[10]+"     "+tree[11]+"     "+tree[12]+"     "+tree[13]+"     "+tree[14]);

		} while (decision != 7);
	}
}