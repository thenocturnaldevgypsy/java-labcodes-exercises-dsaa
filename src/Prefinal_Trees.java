/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Pre-final
 * Group Activity # 1
*/

import java.*;
import java.util.Scanner;

public class Prefinal_Trees {
	public Prefinal_Trees() {
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