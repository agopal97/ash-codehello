package Basics;

public class NumbersCalc {
	
	static void printName(){
		System.out.println("Hi, my name is Ashwin");
	}
	static void addNumbers(int numberA, int numberB) {
		int sum= numberA + numberB;
		System.out.println("The sum of the numbers " + numberA + " and " + numberB + " is " + sum);
	}
	static int multipleNumbers(int valueA,int valueB ) {
		int product = valueA*valueB;
		return product;
	}
	
	public static void main(String[] args) {
		System.out.println("Program initiated ");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println(multipleNumbers(numA, numB));
		
	}
	
}
