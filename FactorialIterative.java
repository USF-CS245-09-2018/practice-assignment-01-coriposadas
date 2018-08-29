/*
A class to solve factorials iteratively.
@author Cori Posadas
*/

public class FactorialIterative implements Factorial{

	public int factorial(int n) {

		int x = n;
		for (int i = n - 1; i > 0; i--){
			x *= i;
		}
		return x;
	}
}