package Action_item4;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {
		        String str = "I Love My Country";
		        String strWithoutSpaces = removeSpaces(str);
		        System.out.println("Original String: " + str);
		        System.out.println("String without spaces: " + strWithoutSpaces);
		    }

		    public static String removeSpaces(String str) {
		    	return str.replace(" ", "");
		    }
		}

