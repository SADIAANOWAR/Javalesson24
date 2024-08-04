package day5;

public class StringManipulation {

	public static void main(String[] args) {

		// String are immutable - it cannot be changed
		String s = "Welcome 123";// string literal
		// s = "Welcome to Java Selenium";

		int num = 1000;
		num = 2000;
		String s2 = new String("Welcome");// through string object

		// to learn important methods of String Class
		// length()--counts all the characters in a string and returns the number in int
		// data type

		int length = s2.length();
		System.out.println("The length is : " + length);

		System.out.println(s.length());

		// concat()- works to join multiple strings
		String s1 = "Welcome";
		String s3 = " to java";
		String s4 = " programming";
		System.out.println(s1.concat(s3).concat(s4)); // method chaining

		// trim() - would trim any leading and trailing spaces from a string
		s = "       welcome to java    ";
		System.out.println(s.length());
		s.trim();
		System.out.println(s.trim().length());

		// charAt()--return a single character out of a string from specific index
		// index starts from 0
		s = "Java Selenium";
		System.out.println(s.charAt(5));

		// contains() -- returns a boolean (true/false)
		System.out.println(s.contains("Jav"));
		System.out.println(s.contains("Sel"));
		System.out.println(s.contains("ium"));
		System.out.println(s.contains("ava"));
		System.out.println(s.contains("Sli"));

		// equals(0, equalsIgnoreCase() -->compares to strings and returns true/false
		s1 = "welcome";
		s2 = "welcome";
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equalsIgnoreCase("s2"));

		// replace() -it replaces a single character or character sequence of a given
		// string
		s = "welcome to java selenium automation";
		System.out.println(s.replace("w", "W"));
		System.out.println(s.replace("java", "Python"));

		// substring()-- extracts substring from the main string

		System.out.println(s.substring(length));
		System.out.println(s.substring(11)); // result - everything from java(java selenium automation)
		System.out.println(s.substring(11, 15));// java

		// toUpperCase() toLowerCase -->converts cases
		s = "Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		// split() --split or divide original string into multiple parts based on
		// delimiter
		s = "abc@xyz";
		String a[] = s.split("@");
		System.out.println(a[1]);

		//
		s = "welcome to java selenium automation";
		String b[] = s.split(" ");
		System.out.println(b[3]);
		// replacing empty spaces with under score _
		s = "welcome to java selenium automation";
		System.out.println(s.replace(" ", "_"));

		s1 = "abc,123@m.com";
		String[] c = s1.split(",");
		System.out.println(c[1]);

	}
}
