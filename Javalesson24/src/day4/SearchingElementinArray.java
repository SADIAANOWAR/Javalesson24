package day4;

import java.util.Scanner;
public class SearchingElementinArray {
	// searching an element from an array
	public static void main(String[] args) {

		// create an array
		int a[] = { 10, 40, 20, 30, 60, 50, 90, 80 };
		Scanner sc = new Scanner(System.in); //system.in -->from the system we will get input
		System.out.println("Please type a number to search for. ");
		
		boolean status = false; // create a flag/status state
		// declare a number to search for
		int search_num = sc.nextInt();
        //nextInt-->expecting integer value 
		for (int i = 0; i < a.length; i++) {
			if (search_num == a[i]) {
				System.out.println("Element found!!");
				status = true;
				break;
			}
			
		}
		
		if (status == false) {
			System.out.println("Sorry!!! Element not found.");
		}

	}

}
