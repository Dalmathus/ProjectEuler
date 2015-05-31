
import java.util.*;

public class Euler4 {

	/**
	//	https://projecteuler.net/problem=4
	//	sFind the largest palindrome made from the product of two 3-digit numbers.
	//	@author James Luxton
	**/
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		Set<Integer> palindromes = new HashSet<Integer>();

		int res;
		for (int i = 500; i <= 999; i++) {
			int m = 999;
			while (m >= 100) {
				res = i * m;
				if(isPalindrome(res)) palindromes.add(res);
				m--;
			}
		}

		TreeSet sortedSet = new TreeSet<Integer>(palindromes);
		System.out.println(sortedSet.last());

		long endTime = System.currentTimeMillis();
		System.err.println("Proccess took " + (endTime - startTime) + " milliseconds");
	}

	/**
	//	tests an int if it is a palimdromic number
	//	@param i integer value to test for palindrome
	//	@return true if i is a palindrome
	**/
	public static boolean isPalindrome(int i) {
		String fwd = Integer.toString(i);
		StringBuilder bck = new StringBuilder(fwd).reverse();
		if (fwd.equals(bck.toString())) return true;		
		return false;
	}
}