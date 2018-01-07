package Basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the previous fibonnaci numbers.
		System.out.println(fib(6));
	}
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2) );
	}
}
