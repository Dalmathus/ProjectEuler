public class Euler15 {

	/**
	//	https://projecteuler.net/problem=15
	//	How many such routes are there through a 20×20 grid?
	//	@author James Luxton
	**/
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		final int GRIDSIZE = 20;
		final int VARS = 2; // Down and Right
		long paths = 1;
		
		// All paths are of 2N size if N variables are used ie 2x2 grid has DDRR, DRDR, DRRD, RDRD, RDDR, RRDD.

		for (int i = 0; i < GRIDSIZE; i++) {
    		paths *= (VARS * GRIDSIZE) - i;
    		paths /= i + 1;
		}

		System.out.println(paths);

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
	}
}