/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Finals
 * Group Activity # 2
*/

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner x = new Scanner (System.in);
		int option = 6, internal;
		String YesNo, IndiGro = "i";
		do {
			System.out.println("Data Structures and Algorithm Analysis - Compilation of Java Lab Demo and Exercises\n");
			System.out.println("| 1 | All Activities under Prelim Period");
			System.out.println("| 2 | All Activities under Midterm Period");
			System.out.println("| 3 | All Activities under Pre-finals Period");
			System.out.println("| 4 | All Activities under Finals Period");
			System.out.println("| 5 | Individual Summary Notes\n");
			System.out.print("Enter a choice from 1 to 5, press 0 to QUIT: ");
			option = x.nextInt();
			
			switch (option) {
				case 0:
					System.out.print("\nAre you SURE you want to QUIT (Y/N)? ");
					YesNo = x.next();
					if (YesNo.equalsIgnoreCase("n")) { //cancel exit
						option = 6;
					}
				break;
				case 1:					
					do {
						System.out.println("\nYou've selected | 1 | All Activities under Prelim Period\n");
						System.out.println("| D | Demo");
						System.out.println("| E | Exercises");
						System.out.print("\nEnter a choice from D and E, press 0 to GO BACK: ");
						IndiGro = x.next();
						if (IndiGro.equalsIgnoreCase("d")) {
							internal = 1;
							do {
								System.out.println("\nAll Activities under Prelim Period > | D | Demo\n");
								System.out.println("|  1 | Demo: One Dimentional Array (Demo_OneDimArray.java)");
								System.out.println("|  2 | Demo: One Dimentional Array - Debug");
								System.out.println("|  3 | Demo: One Dimentional Array - Input");
								System.out.println("|  4 | Demo: Two Dimentional Array");
								System.out.println("|  5 | Demo: Two Dimentional Array - String");
								System.out.println("|  6 | Demo: Two Dimentional Array - Storing");
								System.out.println("|  7 | Demo: Method");
								System.out.println("|  8 | Demo: Method - Return");
								System.out.println("|  9 | Demo: Method - Void");
								System.out.println("| 10 | Demo: Stack");
								System.out.println("| 11 | Demo: String - ReversedWord");
								System.out.println("| 12 | Demo: Stack - Decimal To Binary");
								System.out.print("\nEnter a choice from 1 to 12, press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Demo_OneDimArray();
										System.out.println();
									break;
									case 2:
										System.out.println();
										new Prelim_OneDimArray_Debug();
										System.out.println();
									break;
									case 3:
										System.out.println();
										new Prelim_OneDimArray_Input();
										System.out.println();
									break;
									case 4:
										System.out.println();
										new Prelim_TwoDimArray_Demo();
										System.out.println();
									break;
									case 5:
										System.out.println();
										new Prelim_TwoDimArray_String();
										System.out.println();
									break;
									case 6:
										System.out.println();
										new Prelim_TwoDimArray_Storing();
										System.out.println();
									break;
									case 7:
										System.out.println();
										new Prelim_Method_Demo();
										System.out.println();
									break;
									case 8:
										System.out.println();
										new Prelim_Method_ReturnDemo();
										System.out.println();
									break;
									case 9:
										System.out.println();
										new Prelim_Method_VoidDemo();
										System.out.println();
									break;
									case 10:
										System.out.println();
										new Midterm_Stack_Demo();
										System.out.println();
									break;
									case 11:
										System.out.println();
										new Midterm_String_ReversedWord();
										System.out.println();
									break;
									case 12:
										System.out.println();
										new Midterm_Stack_DecToBin();
										System.out.println();
									break;
									default:
										System.out.println("Invalid input!");
								}
							} while (internal != 0);
						} else if (IndiGro.equalsIgnoreCase("e")) {
							internal = 1;
							do {
								System.out.println("\nAll Activities under Prelim Period > | E | Exercises\n");
								System.out.println("|  1 | Exercise # 1: Java Refresher");
								System.out.println("|  2 | Exercise # 2: One Dimentional Array - Minimum, Maximum, Average");
								System.out.println("|  3 | Exercise # 3: Two Dimentional Array - Minimum, Maximum, Average");
                                System.out.println("|  4 | Exercise # 4: Arrays - Faculty Rate and Salary");
								System.out.println("|  5 | Exercise # 5: Arrays - BubbleSort");
								System.out.println("|  6 | Exercise # 6: Arrays - Linear Binary Search");
								System.out.println("|  7 | Exercise # 7: Arrays - InsertionSort and SelectionSort");
								System.out.println("|  8 | Exercise # 8: Method - Operations");
								System.out.println("|  9 | Exercise # 9: Method - Factorial");
								System.out.println("| 10 | Exercise # 10: Method - TriangularNumber");
								System.out.println("| 11 | Exercise # 11: Stack - Reversed Word");
								System.out.println("| 12 | Exercise # 12: Stack - Leave Bracket Alone");
								System.out.println("| 13 | Exercise # 13: Stack - Decimal Conversion");
								System.out.print("\nEnter a choice from 1 to 13, press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Prelim_Individual();
										System.out.println();
									break;
									case 2:
										System.out.println();
										new Prelim_OneDimArray_MinMax();
										System.out.println();
									break;
									case 3:
										System.out.println();
										new Prelim_TwoDimArray_MinMax();
										System.out.println();
									break;
									case 4:
										System.out.println();
										new Prelim_Array_FacRate();
										System.out.println();
									break;
									case 5:
										System.out.println();
										new Prelim_BubbleSort();
										System.out.println();
									break;
									case 6:
										System.out.println();
										new Prelim_LinearBinarySearch();
										System.out.println();
									break;
									case 7:
										System.out.println();
										new Prelim_InsertionSortSelectionSort();
										System.out.println();
									break;
									case 8:
										System.out.println();
										new Prelim_Method_Operations();
										System.out.println();
									break;
									case 9:
										System.out.println();
										new Prelim_Method_Factorial();
										System.out.println();
									break;
									case 10:
										System.out.println();
										new Prelim_Method_TriangularNumber();
										System.out.println();
									break;
									case 11:
										System.out.println();
										new Midterm_Stack_ReversedWord();
										System.out.println();
									break;
									case 12:
										System.out.println();
										new Midterm_Stack_LeaveBracket();
										System.out.println();
									break;
									case 13:
										System.out.println();
										new Midterm_Stack_DecimalConversion();
										System.out.println();
									break;
									default:
										System.out.println("Invalid input!");
								}
							} while (internal != 0);
						} else if (IndiGro.equals("0")) {
							IndiGro = "0";
						} else {							
							System.out.println("Invalid input!");
							IndiGro = "i";
						}
					} while ((IndiGro.equalsIgnoreCase("d")) || (IndiGro.equalsIgnoreCase("e")));
				break;
				case 2:
					do {
						System.out.println("\nYou've selected | 1 | All Activities under Midterm Period\n");
						System.out.println("| D | Demo");
						System.out.println("| E | Exercises");
						System.out.print("\nEnter a choice from D and E, press 0 to GO BACK: ");
						IndiGro = x.next();
						if (IndiGro.equalsIgnoreCase("d")) {
							internal = 1;
							do {
								System.out.println("\nAll Activities under Midterm Period > | D | Demo\n");
								System.out.println("| 1 | Demo: Linked List");
								System.out.print("\nEnter a choice [1], press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Midterm_LinkedList_Demo();
										System.out.println();
									break;
									default:
										System.out.println("Invalid input!");
								}								
							} while (internal != 0);
						} else if (IndiGro.equalsIgnoreCase("e")) {
							internal = 1;
							do {
								System.out.println("\nAll Activities under Midterm Period > | E | Exercises\n");
								System.out.println("| 1 | Exercise #1 : Linked List - Linear Search");
								System.out.println("| 2 | Exercise #2 : Linked List - Reversed Linear Search");
								System.out.println("| 3 | Exercise #3 : One Dimensional Array - Queue");
								System.out.println("| 4 | Exercise #4 : Linked List - Queue");
                                System.out.println("| 5 | Exercise #5 : Linked List - Data Manipulation");
								System.out.print("\nEnter a choice from 1 to 5, press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Midterm_LinkedList_LinearSearch();
										System.out.println();
									break;
									case 2:
										System.out.println();
										new Midterm_LinkedList_ReversedLinearSearch();
										System.out.println();
									break;
									case 3:
										System.out.println();
										new Prefinal_OneDimArray_Queue();
										System.out.println();
									break;
									case 4:
										System.out.println();
										new Prefinal_LinkedList_Queue();
										System.out.println();
									break;
									case 5:
										System.out.println();
										new Midterm_LinkedList_DataManipulation();
										System.out.println();
									break;
									default:
										System.out.println("Invalid input!");									
								}
							} while (internal != 0);
						} else if (IndiGro.equals("0")) {
							IndiGro = "0";
						} else {
							System.out.println("Invalid input!");
							IndiGro = "i";
						}
					} while ((IndiGro.equalsIgnoreCase("d")) || (IndiGro.equalsIgnoreCase("e")));
				break;
				case 3:
					do {
						System.out.println("\nYou've selected | 1 | All Activities under Pre-finals Period\n");
						System.out.println("| E | Exercises");
						System.out.print("\nEnter a choice from [E], press 0 to GO BACK: ");
						IndiGro = x.next();
						if (IndiGro.equalsIgnoreCase("e"))  {
							do {
								System.out.println("\nAll Activities under Pre-finals Period > | E | Exercises\n");
								System.out.println("| 1 | Exercise #1 : Trees");
								System.out.print("\nEnter a choice [1], press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Prefinal_Trees();
										System.out.println();
									break;
									default:
										System.out.println("Invalid input!");
								}
							} while (internal != 0);
						} else if (IndiGro.equals("0")) {
							IndiGro = "0";
						} else {
							System.out.println("Invalid input!");
							IndiGro = "i";
						}
					} while (IndiGro.equalsIgnoreCase("e"));
				break;
				case 4:
					do {
						System.out.println("\nYou've selected | 1 | All Activities under Finals Period\n");
						System.out.println("| E | Exercises");
						System.out.print("\nEnter a choice from [E], press 0 to GO BACK: ");
						IndiGro = x.next();
						if (IndiGro.equalsIgnoreCase("e"))  {
							do {
								System.out.println("\nAll Activities under Finals Period > | E | Exercises\n");
								System.out.println("| 1 | Exercise #1 : Shellsort");
								System.out.print("\nEnter a choice [1], press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Finals_Shellsort();
										System.out.println();
									break;
									default:
										System.out.println("Invalid input!");
								}
							} while (internal != 0);
						} else if (IndiGro.equals("0")) {
							IndiGro = "0";
						} else {
							System.out.println("Invalid input!");
							IndiGro = "i";
						}
					} while (IndiGro.equalsIgnoreCase("e"));
				break;
				case 5:
					System.out.println();
					System.out.println("\nYou've selected | 5 | Individual Summary Notes\n");
					System.out.println("\n-----\n");
					new Finals_SubjectFeedback();
					System.out.println("\n\n-----\n");
				break;
				default: // if value more than the option allowed
					System.out.println("\n** PLEASE CHOOSE FROM 1 TO 5! **");
			}
			System.out.println();
		} while (option != 0);
	}
}
