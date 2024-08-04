package Personal_info;

public class Factorial {
	
	public static void main(String[] args) {
        int number = 10; 
        int factorial = calculateFactorial(number);
        System.out.println(number + "! = " + factorial);
    }

    public static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
