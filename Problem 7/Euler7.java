import java.util.*;

public class Euler7 {
	
	/**
	//	https://projecteuler.net/problem=7
	//	What is the 10001st prime number?
	//	@author James Luxton
	**/
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		TreeSet<Long> primes = new TreeSet<Long>();
		
		long count = 2;
		while(primes.size() < 10001) {
			if (isPrime(count)) primes.add(count);
			count++;
		}

		System.out.println(primes.last());

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