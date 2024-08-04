package Action_item4;

public class RemovingSpecialCharacter {

	public static void main(String[] args) {

		String str = "Hello, World! 123 @#$";
		String newStr = removeSpecialCharacters(str);
		System.out.println("Original String: " + str);
		System.out.println("Cleaned String: " + newStr);
	}

	public static String removeSpecialCharacters(String str) {
		return str.replaceAll("[^a-zA-Z0-9\\\\s]", "");
	}
}

