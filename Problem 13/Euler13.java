import java.util.*;
import java.io.*;
import java.math.*;

public class Euler13 {

	/**
	//	https://projecteuler.net/problem=13
	//	Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
	//	@author James Luxton
	**/
	public static void main(String[] args) throws FileNotFoundException{

		long startTime = System.currentTimeMillis();

		String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + File.separator + "largeNum.data");
		Scanner sc = new Scanner(file);

		int digits = 0;
		int number = 0;
		BigInteger[] bigNumbers = new BigInteger[100];
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			String line = sc.nextLine();
			String[] split = line.split("");
			for (String s : split) {
				sb.append(s);
				digits++;
				if (digits == 50) {					
					digits = 0;
					bigNumbers[number] = new BigInteger(sb.toString());
					number++;
					sb = new StringBuilder();
				}
			}
		}

		BigInteger sum = new BigInteger("0");

		for (BigInteger bi : bigNumbers) {
			sum = sum.add(bi);
		}

		System.out.println(sum);

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");

	}
}