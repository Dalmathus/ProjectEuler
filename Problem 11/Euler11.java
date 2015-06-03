import java.util.*;
import java.io.*;

public class Euler11 {

	static int[][] grid = new int[20][20];
	static int largestProduct = 0;
	static final int COMBINATIONS = 4;

	/**
	//	https://projecteuler.net/problem=11
	//	What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
	//	@author James Luxton
	**/
	public static void main(String[] args) throws FileNotFoundException {		

		long startTime = System.currentTimeMillis();


		String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + File.separator + "grid.data");
		Scanner sc = new Scanner(file);
		
		final int COMBINATIONS = 4; 
		int k = 0;
		

		while (sc.hasNext()) {
			String[] split = sc.nextLine().split(" ");
			for (int i = 0; i < 20; i++) {
				grid[k][i] = Integer.parseInt(split[i]);
			}
			k++;
		}

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (i < 15 && j > 3) {
					System.out.println(i + "x" + j);
					testProduct(productDiagL(i,j));
				}
				if (i < 15 && j < 15) {
					System.out.println(i + "x" + j);
					testProduct(productDiagR(i,j));
				}
				if (j < 15) {
					System.out.println(i + "x" + j);
					testProduct(productRight(i,j));
				}
				if (i < 15) {
					System.out.println(i + "x" + j);
					testProduct(productDown(i,j));
				}				
			}
		}
	
		System.out.println(largestProduct);

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
	}

	public static void testProduct(int p) {
		if (largestProduct < p) largestProduct = p;
	}

	public static int productDown(int y, int x) {
		int product = 1;

		int limit = y + COMBINATIONS;

		for (; y < limit; y++) 
			product *= grid[y][x];

		return product;
	}

	public static int productRight(int y, int x) {
		int product = 1;

		int limit = x + COMBINATIONS;

		for (; x < limit; x++) 
			product *= grid[y][x];

		return product;
	}

	public static int productDiagR(int y, int x) {
		int product = 1;

		int limit = x + COMBINATIONS;

		for (; x < limit; x++, y++) 
			product *= grid[y][x];

		return product;
	}

	public static int productDiagL(int y, int x) {
		int product = 1;

		// x == 4, y == 4
		// limit == 4 - 4 = 0
		int limit = x - COMBINATIONS;

		// grid(4,4)
		// grid(3,3)
		for (; x > limit; x--, y++) 
			product *= grid[y][x];

		return product;
	}
}