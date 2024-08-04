package Action_item4;

public class EvenOdd_Array {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Numbers in the array: ");
		for (int num : array) {
			if (num % 2 == 0) {
				System.out.print("Even: " + num + " ");
			} else {
				System.out.print("Odd: " + num + " ");
			}
		}
	}

}
