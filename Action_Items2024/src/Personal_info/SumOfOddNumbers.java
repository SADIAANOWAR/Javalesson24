package Personal_info;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int sum = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2!= 0) { 
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 0 to 20: " + sum);
	}

}
