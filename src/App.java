/*
 * Course: Data Structure and Algorithm Analysis
 * Period: Finals
 * Exercise # 3 : Compilation of Java Lab Demo and Exercises
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
								System.out.println("|  1 | Demo # 1: One Dimensional Array (Demo_OneDimArray.java)");
								System.out.println("|  2 | Demo # 2: One Dimensional Array - Debug (Demo_OneDimArray_Debug.java)");
								System.out.println("|  3 | Demo # 3: One Dimensional Array - Input (Demo_OneDimArray_Input.java)");
								System.out.println("|  4 | Demo # 4: Two Dimensional Array (Demo_TwoDimArray.java)");
								System.out.println("|  5 | Demo # 5: Two Dimensional Array - String (Demo_TwoDimArray_String.java)");
								System.out.println("|  6 | Demo # 6: Two Dimensional Array - Storing (Demo_TwoDimArray_Storing.java)");
								System.out.println("|  7 | Demo # 7: Method (Demo_Method.java)");
								System.out.println("|  8 | Demo # 8: Method - Return (Demo_Method_Return.java)");
								System.out.println("|  9 | Demo # 9: Method - Void (Demo_Method_Void.java)");
								System.out.println("| 10 | Demo # 10: Stack (Demo_Stack.java)");
								System.out.println("| 11 | Demo # 11: String - Reversed Word (Demo_String_ReverseWord.java)");
								System.out.println("| 12 | Demo # 12: Stack - Decimal To Binary (Demo_Stack_DecToBin.java)");
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
										new Demo_OneDimArray_Debug();
										System.out.println();
									break;
									case 3:
										System.out.println();
										new Demo_OneDimArray_Input();
										System.out.println();
									break;
									case 4:
										System.out.println();
										new Demo_TwoDimArray();
										System.out.println();
									break;
									case 5:
										System.out.println();
										new Demo_TwoDimArray_String();
										System.out.println();
									break;
									case 6:
										System.out.println();
										new Demo_TwoDimArray_Storing();
										System.out.println();
									break;
									case 7:
										System.out.println();
										new Demo_Method();
										System.out.println();
									break;
									case 8:
										System.out.println();
										new Demo_Method_Return();
										System.out.println();
									break;
									case 9:
										System.out.println();
										new Demo_Method_Void();
										System.out.println();
									break;
									case 10:
										System.out.println();
										new Demo_Stack();
										System.out.println();
									break;
									case 11:
										System.out.println();
										new Demo_String_ReverseWord();
										System.out.println();
									break;
									case 12:
										System.out.println();
										new Demo_Stack_DecToBin();
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
								System.out.println("|  1 | Exercise # 1: Java Refresher (Prelim_Exercise1_JavaRefresher.java)");
								System.out.println("|  2 | Exercise # 2: One Dimensional Array - Minimum, Maximum, Average (Prelim_Exercise2_OneDimArray_MinMaxAve.java)");
								System.out.println("|  3 | Exercise # 3: Two Dimensional Array - Minimum, Maximum, Average (Prelim_Exercise3_TwoDimArray_MinMaxAve.java)");
                                System.out.println("|  4 | Exercise # 4: Arrays - Faculty Listing, Type, Rate and Salary (Prelim_Exercise4_FacultyPayslip.java)");
								System.out.println("|  5 | Exercise # 5: Arrays - BubbleSort (Prelim_Exercise5_BubbleSort.java)");
								System.out.println("|  6 | Exercise # 6: Arrays - Linear Binary Search (Prelim_Exercise6_LinearBinarySearch.java)");
								System.out.println("|  7 | Exercise # 7: Arrays - Insertion Sort and Selection Sort (Prelim_Exercise7_InsertionSortSelectionSort.java)");
								System.out.println("|  8 | Exercise # 8: Method - Operations (Prelim_Exercise8_Method_Operations.java)");
								System.out.println("|  9 | Exercise # 9: Method - Factorial (Prelim_Exercise9_Method_Factorial.java)");
								System.out.println("| 10 | Exercise # 10: Method - TriangularNumber (Prelim_Exercise10_Method_TriangularNumber.java)");
								System.out.println("| 11 | Exercise # 11: Stack - Reversed Word (Prelim_Exercise11_Stack_ReverseWord.java)");
								System.out.println("| 12 | Exercise # 12: Stack - Leave Bracket Alone (Prelim_Exercise12_Stack_Brackets.java)");
								System.out.println("| 13 | Exercise # 13: Stack - Decimal Conversion (Prelim_Exercise13_DecimalConversion.java)");
								System.out.print("\nEnter a choice from 1 to 13, press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Prelim_Exercise1_JavaRefresher();
										System.out.println();
									break;
									case 2:
										System.out.println();
										new Prelim_Exercise2_OneDimArray_MinMaxAve();
										System.out.println();
									break;
									case 3:
										System.out.println();
										new Prelim_Exercise3_TwoDimArray_MinMaxAve();
										System.out.println();
									break;
									case 4:
										System.out.println();
										new Prelim_Exercise4_FacultyPayslip();
										System.out.println();
									break;
									case 5:
										System.out.println();
										new Prelim_Exercise5_BubbleSort();
										System.out.println();
									break;
									case 6:
										System.out.println();
										new Prelim_Exercise6_LinearBinarySearch();
										System.out.println();
									break;
									case 7:
										System.out.println();
										new Prelim_Exercise7_InsertionSortSelectionSort();
										System.out.println();
									break;
									case 8:
										System.out.println();
										new Prelim_Exercise8_Method_Operations();
										System.out.println();
									break;
									case 9:
										System.out.println();
										new Prelim_Exercise9_Method_Factorial();
										System.out.println();
									break;
									case 10:
										System.out.println();
										new Prelim_Exercise10_Method_TriangularNumber();
										System.out.println();
									break;
									case 11:
										System.out.println();
										new Prelim_Exercise11_Stack_ReverseWord();
										System.out.println();
									break;
									case 12:
										System.out.println();
										new Prelim_Exercise12_Stack_Brackets();
										System.out.println();
									break;
									case 13:
										System.out.println();
										new Prelim_Exercise13_DecimalConversion();
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
								System.out.println("| 1 | Demo # 1: Linked List (Demo_LinkedList.java)");
								System.out.print("\nEnter a choice [1], press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Demo_LinkedList();
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
								System.out.println("| 1 | Exercise # 1: Linked List - Linear Search (Midterm_Exercise1_LinkedList_LinearSearch.java)");
								System.out.println("| 2 | Exercise # 2: Linked List - Reversed Linear Search (Midterm_Exercise2_LinkedList_ReversedLinearSearch.java)");
								System.out.println("| 3 | Exercise # 3: One Dimensional Array - Queue (Midterm_Exercise3_OneDimArray_Queue.java)");
								System.out.println("| 4 | Exercise # 4: Linked List - Queue (Midterm_Exercise4_LinkedList_Queue.java)");
                                System.out.println("| 5 | Exercise # 5: Linked List - Data Manipulation (Midterm_Exercise5_LinkedList_DataManipulation.java)");
								System.out.print("\nEnter a choice from 1 to 5, press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Midterm_Exercise1_LinkedList_LinearSearch();
										System.out.println();
									break;
									case 2:
										System.out.println();
										new Midterm_Exercise2_LinkedList_ReversedLinearSearch();
										System.out.println();
									break;
									case 3:
										System.out.println();
										new Midterm_Exercise3_OneDimArray_Queue();
										System.out.println();
									break;
									case 4:
										System.out.println();
										new Midterm_Exercise4_LinkedList_Queue();
										System.out.println();
									break;
									case 5:
										System.out.println();
										new Midterm_Exercise5_LinkedList_DataManipulation();
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
								System.out.println("| 1 | Exercise # 1: Trees (Prefinal_Exercise1_Trees.java)");
								System.out.print("\nEnter a choice [1], press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Prefinal_Exercise1_Trees();
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
								System.out.println("| 1 | Exercise # 1: N-sort (Finals_Exercise1_NSort.java)");
								System.out.print("\nEnter a choice [1], press 0 to GO BACK: ");
								internal = x.nextInt();
								switch (internal) {
									case 0:
										internal = 0;
									break;
									case 1:
										System.out.println();
										new Finals_Exercise1_NSort();
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
					System.out.println("-----\n");
					new TheEnd_Feedback();
					System.out.println("\n\n-----\n");
				break;
				default: // if value more than the option allowed
					System.out.println("\n** PLEASE CHOOSE FROM 1 TO 5! **");
			}
			System.out.println();
		} while (option != 0);
	}
}
