package day4;

public class WhileLoop {

	public static void main(String[] args) {
		
/*
		// loop format-->>initialization;condition/logic;increment/decrements
		System.out.println("*****Using while loop****".repeat(2));

		for (int num = 1; num <= 5; num++) {
			System.out.println(num);

		}
		System.out.println("*****Using while loop****".repeat(2));

		// print 1 to 5 using while loop
		int num = 1;
		while (num <= 5) {
			System.out.println(num);
			num++;

		}
		int number = 1;
		do {
//			System.out.println(number);
			System.out.println("**John");
			number++;

		} while (number <= 5);
*/
		//situation -1
		for (int i=1; i<10; i++) {
			System.out.println(i);
			//keeping the code intact , exclude printing 6 to 10 
			if(i==5) {
				break;//Jumping statement (jumping out of the loop)
				
			}
		}
		System.out.println("Situation 2");
		//situation -2; Print all the numbers less 5 
		for(int i=1;i<=10; i++) {
			if(i==5) {
				continue;//skip the current sequence 
			}
			System.out.println(i);
			
		}

	}
	
	
}
