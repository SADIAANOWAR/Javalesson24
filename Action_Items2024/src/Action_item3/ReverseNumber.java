package Action_item3;

public class ReverseNumber {
	public static void main(String[] args) {
		int p = 8934456;
		int reversed = 0;

		while (p > 0) {
			reversed = reversed * 10 + p % 10;
			p /= 10;
		}
		System.out.println(reversed);
	}

}
