import java.util.*;

public class Euler9 {
	
	/**
	//	https://projecteuler.net/problem=9
	//	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	//	Find the product abc.
	//	@author James Luxton
	**/
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		int TARGET = 1000;
		int scalingFactor = 1;

		for (int[] ia : findPrimitives()) {
			System.out.println("PRIMITVE: " + ia[0] + ", " + ia[1] + ", " + ia[2]);

			while (true) {

				int a = ia[0] * scalingFactor;
				int b = ia[1] * scalingFactor;
				int c = ia[2] * scalingFactor;

				//System.out.println(a + " " + b + " " + c + " = " + (a + b + c));

				if ((a + b + c) == TARGET) {
					System.out.println("PRIMITVE SUCCESS");
					System.out.println("Target sum: " + TARGET);
					System.out.println("Scaling Factor: " + scalingFactor);
					System.out.println("abc: " + a + " " + b + " " + c);
					System.out.println("Product of abc: " + a * b * c);
					long endTime = System.currentTimeMillis();
					System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
					System.exit(-1);
				}
				else if(a + b + c > TARGET) {
					break;
				}

				scalingFactor++;
			}	

			System.out.println("PRIMITVE FAILED");
			scalingFactor = 1; 
		}		

		System.out.println("No solution was found");
		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
	}	

	public static List<int[]> findPrimitives() {
		List<int[]> triples = new ArrayList<int[]>();

		for (int a = 1; a <= 98; a++) {
			for (int b = 2; b <= 99; b++) {
				for (int c = 3; c <= 100; c++) {
					if ((a*a + b*b) == c*c) {
						triples.add(new int[]{a,b,c});
					}
					if ((a*a + b*b) <= c*c) {
						break;
					}
				}
			}
		}
		return triples;
	}
}