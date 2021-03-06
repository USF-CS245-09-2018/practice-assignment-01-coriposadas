/*
A class to solve factorials recursively.
@author Cori Posadas
*/

public class FactorialRecursive implements Factorial {

	public int factorial(int n) {

		if (n == 1) {
			return 1;
		}
		return n * factorial(n -1);
	}
}