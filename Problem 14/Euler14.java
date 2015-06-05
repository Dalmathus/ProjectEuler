
public class Euler14 {

	/**
	//	https://projecteuler.net/problem=14
	//	Which starting number, under one million, produces the longest chain?
	//	@author James Luxton
	**/
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		final int TARGET = 1000000;
		long a;
		int chain;
		int longestChain = 0;
		int chainOwner = 0;
		for(int i = 1; i < TARGET; i += 2) {
			a = i;
			chain = 1;
			while( a != 1 ) {
				a = ((a & 1) == 1) ? (3 * a + 1) : (a / 2);
				chain++;
			}
			if(chain > longestChain) {
				longestChain = chain;
				chainOwner = i;
			}
		}
		System.out.println(chainOwner);

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");

	}
}