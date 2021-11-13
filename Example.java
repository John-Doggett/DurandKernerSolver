package durandKernerSolver;
// Copyright John Doggett 2021.

public class Example {
	public static void main(String[] args) {
		double[] real = new double[] {1, -13.0/4.0, 47.0/16.0,-35.0/64.0};
		// Real parts of each coefficient of the polynomial.
		// If term in polynomial has 0 as coefficient put 0 in real
		// and imaginary part.
		double[] imag = new double[] {0, 0, 0, 0};
		// Imaginary part of coefficient.
		double[][] temp = DurandKernerSolver.solvePolynomial(real, imag);
		for(int a = 0; a < temp[0].length; a++) {
			System.out.println(temp[0][a] + " " + temp[1][a] + "I");
		}
		//Prints out each root.
	}
}
