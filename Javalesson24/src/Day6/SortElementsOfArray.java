package Day6;

import java.util.Arrays;

public class SortElementsOfArray {
	// predefined class
	public static void main(String[] args) {
		int array[] = { 86, 78, 77, 9, 87 };
		Arrays.sort(array);
		System.out.println("Elements of array in ascending order :");
		for (int value : array) {

			System.out.println(value + " ");
		}

		System.out.println();
		sortMyarray(array);
	}

//bubble sort technique
	public static void sortMyarray(int[] givenArray) {
		int length = givenArray.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length  -i-1; j++) {
				if (givenArray[j] > givenArray[j + 1]) {
					int temp = givenArray[j];
					givenArray[j] = givenArray[j + 1];
					givenArray[j + 1] = temp;

				}
			}

		}
		System.out.println("Sorted array:");

		for (int value : givenArray) {
			System.out.println(value + "\t");
		}

	}

}
