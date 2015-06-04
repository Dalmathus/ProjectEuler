
public class Euler12 {

	/**
	//	https://projecteuler.net/problem=12
	//	What is the value of the first triangle number to have over five hundred divisors?
	//	@author James Luxton
	**/
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		final int TARGET = 500;
		int triNum = 1;
		int total = 0;

		while (true) {
			total += triNum;
			if (numFactors(total) >= TARGET)
				break;
			triNum++;
		}

		System.out.println(total);

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");

	}

	public static int numFactors(int f) {

		int i = 1;
		int factors = 0;

		while(i*i <= f) {
			if(f % i == 0)
				factors += 2;
			i++;
		}
		return factors;
	}

}