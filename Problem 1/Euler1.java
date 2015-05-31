
public class EulerOne {

	/**
	//	https://projecteuler.net/problem=1
	//	Finds the sum of all factors of 3 or 5 under 1000
	//	@author James Luxton
	**/
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		int res = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) res+= i;
		}
		System.out.println(res);

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");

	}
}