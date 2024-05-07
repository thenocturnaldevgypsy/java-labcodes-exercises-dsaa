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
			System.out.println("[1-Insert|2-Search|3-Delete|4-Inorder Traversal|5-Preorder Traversal|6-Postorder Traversal|7-Quit]\n");
			System.out.print("What do you want to do? ");
			decision = x.nextInt();

			switch (decision) {
				case 1:
					System.out.print("Insert: ");
					inTree = x.nextInt();
					if (tree[0] == 0) { // check if root node is not yet taken
						tree[0] =  inTree; // if root node is blank, save it there
					} else { //root node taken, proceed with comparing
						if (inTree < tree[0]) { // if less root node, go left
							if (tree[1] == 0) { // if root node left child empty
								tree[1] = inTree;
							} else { //tree[1] is occupied, proceed with comparing
								if (inTree < tree[1]) { //if less tree[1], go left
									if (tree[3] == 0) { // check if tree[3] is empty
										tree[3] = inTree;
									} else { //tree[3] is occupied, proceed with comparing
										if (inTree < tree[3]) { //if less tree[3], go left
											if (tree[7] == 0) { // check if tree[7] is empty
												tree[7] = inTree;
											} else {
												if (inTree < tree[7]) { //if lower than tree[7]
													System.out.println("The levei of the binary tree is not enought to insert that.");
												}
											}
										} else { //higher than tree[3]
											if (tree[8] == 0) { // check if tree[8] is empty
												tree[8] = inTree;
											} else {
												if (inTree < tree[8]) { //if lower than tree[8]
													System.out.println("The levei of the binary tree is not enought to insert that.");
												}
											}
										}
									}
								} else { //if greater than tree[1], go right
									if (tree[4] == 0) {
										tree[4] = inTree;
									} else { //tree[4] is occupied, proceed with comparing
										if (inTree < tree[4]) { //if less tree[4], go left
											if (tree[9] == 0) { // check if tree[9] is empty
												tree[9] = inTree;
											} else {
												if (inTree < tree[9]) { //if lower than tree[9]
													System.out.println("The levei of the binary tree is not enought to insert that.");
												}
											}
										} else { //higher than tree[4]
											if (tree[10] == 0) { // check if tree[10] is empty
												tree[10] = inTree;
											} else {
												if (inTree < tree[10]) { //if lower than tree[10]
													System.out.println("The levei of the binary tree is not enought to insert that.");
												}
											}
										}
									}
								}
							}
						} else { // if greater than root node, go right
							if (tree[2] == 0) { // if root node right child empty
								tree[2] = inTree;
							} else { //tree[2] is occupied, proceed with comparing
								if (inTree < tree[2]) { //if less tree[2], go left
									if (tree[5] == 0) { // check if tree[5] is empty
										tree[5] = inTree;
									} else { //tree[5] is occupied, proceed with comparing
										if (inTree < tree[5]) { //if less tree[5], go left
											if (tree[11] == 0) { // check if tree[11] is empty
												tree[11] = inTree;
											} else {
												if (inTree < tree[11]) { //if lower than tree[11]
													System.out.println("The levei of the binary tree is not enought to insert that.");
												}
											}
										} else { //higher than tree[5]
											if (tree[12] == 0) { // check if tree[12] is empty
												tree[12] = inTree;
											} else {
												if (inTree < tree[12]) { //if lower than tree[12]
													System.out.println("The levei of the binary tree is not enought to insert that.");
												}
											}
										}
									}
								} else { //if greater than tree[2], go right
									if (tree[6] == 0) {
										tree[6] = inTree;
									} else { //tree[6] is occupied, proceed with comparing
										if (inTree < tree[6]) { //if less tree[6], go left
											if (tree[13] == 0) { // check if tree[13] is empty
												tree[13] = inTree;
											} else {
												if (inTree < tree[13]) { //if lower than tree[13]
													System.out.println("The levei of the binary tree is not enought to insert that.");
												}
											}
										} else { //higher than tree[4]
											if (tree[14] == 0) { // check if tree[14] is empty
												tree[14] = inTree;
											} else {
												if (inTree < tree[14]) { //if lower than tree[14]
													System.out.println("The levei of the binary tree is not enought to insert that.");
												}
											}
										}
									}
								}
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

				case 3:
					System.out.println("\nSkipping DELETE at the moment, please choose another option.");
				break;

				case 4: //Inorder Traversal

				break;

				case 5: //Preorder Traversal

				break;

				case 6: //Postorder Traversal

				break;

				default: // if value more than the option allowed
					System.out.println("\n** PLEASE CHOOSE FROM 1 OR 2! **");
			}

			System.out.println("\nUpdated content of the Tree:\n");
			System.out.println("Level 1 : [ 0:"+tree[0]+" ]");
			System.out.println("Level 2 : [ 1:"+tree[1]+" ]  |||  [ 2:"+tree[2]+" ]");
			System.out.println("Level 3 : [ 3:"+tree[3]+" ]  ||  [ 4:"+tree[4]+" ]  |||  [ 5:"+tree[5]+" ]  ||  [ 6:"+tree[6]+" ]");
			System.out.println("Level 4 : [ 7:"+tree[7]+" ]  |  [ 8:"+tree[8]+" ]  ||  [ 9:"+tree[9]+" ]  |  [ 10:"+tree[10]+" ]  |||  [ 11:"+tree[11]+" ]  |  [ 12:"+tree[12]+" ]  ||  [ 13:"+tree[13]+" ]  |  [ 14:"+tree[14]+" ]\n");

/* 			System.out.println("\nUpdated content of the Tree:\n");
			System.out.println("Level 1 : [ "+tree[0]+" ]");
			System.out.println("Level 2 : [ "+tree[1]+" ]  |||  [ "+tree[2]+" ]");
			System.out.println("Level 3 : [ "+tree[3]+" ]  ||  [ "+tree[4]+" ]  |||  [ "+tree[5]+" ]  ||  [ "+tree[6]+" ]");
			System.out.println("Level 4 : [ "+tree[7]+" ]  |  [ "+tree[8]+" ]  ||  [ "+tree[9]+" ]  |  [ "+tree[10]+" ]  |||  [ "+tree[11]+" ]  |  [ "+tree[12]+" ]  ||  [ "+tree[13]+" ]  |  [ "+tree[14]+" ]\n");
 */

		} while (decision != 7);
	}
}