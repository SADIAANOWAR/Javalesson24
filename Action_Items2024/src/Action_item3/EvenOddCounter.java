package Action_item3;

import java.util.Scanner;

public class EvenOddCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;

		while (num != 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num /= 10;
		}
		System.out.println("Even digits: " + evenCount);
		System.out.println("Odd digits: " + oddCount);

	}

}
