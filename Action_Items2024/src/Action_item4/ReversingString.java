package Action_item4;

public class ReversingString {

	public static void main(String[] args) {

		String str = "I Love NY";
		String reversedStr = reverseString(str);
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversedStr);
	}

	public static String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		return reversed;
	}
}
