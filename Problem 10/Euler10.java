
public class Euler10 {

	/**
	//	https://projecteuler.net/problem=10
	//	Find the sum of all the primes below two million.
	//	@author James Luxton
	**/
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		final int TARGET = 2000000;
		long sum = 0;

		for(long i = 2; i <= TARGET; i++) {
			if (isPrime(i)) sum += i;
		}

		System.out.println(sum);

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
	}

	public static boolean isPrime(long num) {

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0 ) {
			return false;
		}

		// Start at three and check if 3^2 is greater than num
		// if it isnt then check if num is evenly divisible by 3
		// if it is then it is not a prime return false
		// go to 5 etc..
		for (long i=3; i*i<=num; i+=2) {
			if (num % i == 0) {
				return false;
			}		
		}
		return true;
	}
}