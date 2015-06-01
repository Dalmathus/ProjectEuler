
public class Euler6 {
	
	/**
	//	https://projecteuler.net/problem=6
	//	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	//	@author James Luxton
	**/
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		long sumSq = 0;
		long sqSum = 0;
		for (int i = 0; i <= 100; i++) {
			sumSq += Math.pow(i,2);
			sqSum += i;
		}

		sqSum = (long)Math.pow(sqSum, 2);

		System.out.println("Sum of the squares " + sumSq + " Square of the Sum " + sqSum + " difference = " + (sqSum - sumSq));

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
	}
}