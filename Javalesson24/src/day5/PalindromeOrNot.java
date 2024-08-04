package day5;

public class PalindromeOrNot {

	public static void main(String[] args) {

		int originalNumber = 353, reverse = 0;
		System.out.println("The original number is : " + originalNumber);
		int number = originalNumber;

		while (number != 0) {

			int remainder = number % 10;
			reverse = reverse * 10 + remainder;

			number = number / 10;

		}
		System.out.println("The reverse number is : " + reverse);

		if (originalNumber == reverse) {
			System.out.println("It is palindrome");

		} else {
			System.out.println("Not a palindrome!!!");
		}

	}

}
