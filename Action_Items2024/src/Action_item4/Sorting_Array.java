package Action_item4;

import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		int[] array = { 5, 2, 8, 1, 9, 3, 7, 6, 4 };

		System.out.println("Original array: " + Arrays.toString(array));

		Arrays.sort(array);

		System.out.println("Sorted array: " + Arrays.toString(array));
	}
}
