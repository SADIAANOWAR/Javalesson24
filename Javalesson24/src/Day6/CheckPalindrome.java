package Day6;

public class CheckPalindrome {

	public static void main(String[] args) {

		String input = "addaj";
		System.out.println("Given string is a palindrome = "+isPalindrome(input));
		String doubtfullInput ="This is my string with speacial characters :_*&^$#@!";
		String result =doubtfullInput.replaceAll("[^a-zA-Z0-9]",  " ");
		System.out.println(result);

	}

	public static boolean isPalindrome(String str) { // String-datatype str-value

		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);

		}
		return str.equals(reversed);

	}

}
