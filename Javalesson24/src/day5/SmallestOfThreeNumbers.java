package day5;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {

		int a = 89, b = 65, c = 33, smallest;
		// a:b --return a or b
		// comparing a & b & extracting the smallest
		int temp = (a < b) ? a : b;

		// compare temp with c and store the result in smallest variable
		smallest = (c < temp) ? c : temp;

		System.out.println("The smallest number is : " + smallest);
		
		//more concise approach 
		smallest = c<(a<b ? a:b)?c:(a<b ? a:b);
		System.out.println("The smallest number is : " + smallest);
	}

}
