
public class Euler3 {
	
	/**
	//	https://projecteuler.net/problem=3
	//	What is the largest prime factor of the number 600851475143
	//	@author James Luxton
	**/
	public static void main(String[] args) {

		long TARGET = 600851475143L;
		// only need to look up to sqrt(TARGET)
		long largestPrime = (long)Math.ceil(Math.sqrt(TARGET));

		while (largestPrime > 1) {

			// first check if the value is odd, a prime cannot be even
			if (largestPrime % 2 != 0) {
				// Then check if the number is factor of TARGET
				if (TARGET % largestPrime == 0) {
					// Finally check if that number is a prime number
					if (isPrime(largestPrime)) {
						System.out.println(largestPrime);
						break;
					}
				}
			}
			largestPrime--;
		}
	}

	public static boolean isPrime(long num) {
		for (long i=3; i*i<=num; i+=2) {
			if (num % i == 0) {
				return false;
			}		
		}
		return true;
	}
}