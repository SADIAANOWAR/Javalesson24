package day5;

public class LargestOfTwoNumbers {

	// using Ternary operator
	public static void main(String[] args) {
		int n1 = 76, n2 = 57, largest;
		// ?(question mark) is the symbol of ternary operator
		largest = (n1 > n2) ? n1 : n2;
		System.out.println("The largest number is : " + largest);

	}

}
