
public class Euler2 {

	/**
	//	https://projecteuler.net/problem=2
	//	Finds the sum of all even fib numbers below 4 millon
	//	@author James Luxton
	**/
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		final int TARGET = 4000000;
		int res = 0;
		int[] fib = new int[]{0,1};
		
		int tmp = 0;
		while (tmp < TARGET) {
			tmp = fib[0] + fib[1];
			if (tmp % 2 == 0) res += tmp;
			if(fib[0] > fib[1]) fib[1] = tmp;
			else fib[0] = tmp;
		}

		System.out.println(res);
		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");

	}
}