package Action_item3;

public class Palindrome {
    public static void main(String[] args) {
        int num = 345;
        int reversed = 0;
        int original = num;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}