package day4;

import java.util.Arrays;
public class ArrayDemo {
	public static void main(String[] args) {
		// declaring an array
		//int myArray[] = new int[5];
		
		int []myArray =new int[5];
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;
		// extract value from the array
		System.out.println(myArray[4]);// 50
		//finding out length of an array
		int length = myArray.length;
		System.out.println("The length is: "+length);
		//declaring and assigning values at one go
		int a[] = {1,2,3,4,5};
		System.out.println(a[4]);
		//extracting all the values or printing all the values out of an array
		System.out.println(Arrays.toString(myArray));
		//print all the values using for loop
		for(int i=0; i<5; i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("****using enhanced for loop****");
		//use enhanced for loop to print all the values of an array 
		for(int mA :myArray) {
			System.out.println(mA);
			
		}
		System.out.println("Printing in reverse order :");
		//printing values from  last index to first index
		for(int i =4;i>=0;i--) {
			System.out.println(myArray[i]);
		}
	}

}
