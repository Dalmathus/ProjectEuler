
public class Euler5 {

	static double res = 2520;
	static double increment = 2520;

	/**
	//	https://projecteuler.net/problem=5
	//	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	//	@author James Luxton
	**/
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		while(true) {			
			if (pTest(res)) break;
			else res += increment;
		}

		System.out.println(res);
		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
	}

	public static boolean pTest(double n) {
		double j;

		for (int i = 1; i <= 20; i++) {
				j = n / i;
				if (j % 1 != 0)  {
					// update the increment to be equal to whatever the last number that was fine was reached, this number will always be better as each increment
					// guarentees a higher increment by reaching a new or equal level
					increment = n / (i - 1);
					return false;
				}
		}
		return true;
	}
}