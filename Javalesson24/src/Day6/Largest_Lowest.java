package Day6;

import java.util.Arrays;

public class Largest_Lowest {

	public static void main(String[] args) {
		// Iteration (Greedy approach)
		int arr[] = { 3, 8, 8, 9, 4, 78, 34 };

		int minimum = arr[0]; // assuming zeroth position as minimum
		int maximum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minimum) {
				minimum = arr[i];
			} else if (arr[i] > maximum) {
				maximum = arr[i];

			}
		}
		System.out.println("The minimum number: " + minimum);
		System.out.println("The maximum number: " + maximum);

		// Using predefined functions/library
		int min = Arrays.stream(arr).min().getAsInt(); // method chaining
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("The minimum number: " + min);
		System.out.println("The maximum number: " + max);

	}

}
