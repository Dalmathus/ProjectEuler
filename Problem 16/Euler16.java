import java.math.*;

public class Euler16 {

	/**
	//	https://projecteuler.net/problem=16
	//	What is the sum of the digits of the number 21000?
	//	@author James Luxton
	**/
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		final int EXPONENT = 1000;
		BigInteger num = new BigInteger("2");		
		num = num.pow(EXPONENT);
		long sum = 0;	

		String[] numbers = num.toString().split("");

		for (String s : numbers) {
			sum += Integer.parseInt(s);
		}

		System.out.println(sum);

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
	}
}