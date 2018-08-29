/*
A class to solve the Fibonacci sequence iteratively.
@author Cori Posadas
*/

public class FibonacciIterative implements Fibonacci {

	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		int a = 1;
		int b = 1;

		for (int i = 2; i < n; i++){
			int c = a;
			a = a + b;
			b = c;
		}

		return a;
	}
}