import java.util.*;
import java.lang.Math; 

/*
Given a string of even length, return the first half. So the string "WooHoo" will return "Woo".

Challenge: use only one line
*/

public class word {

	public static String returnFirst(String str) {

		//here is where you write your code

	}

	public static void main(String[] args) {

		List<String> stringTestCases = Arrays.asList("WooHoo", "HelloThere", "abcdef", "somethings", "lmao", "big black dick");
		List<String> correctTestCases = Arrays.asList("Woo", "Hello", "abc", "somet", "lm", "big bla");
		int wrongs = 0;

		for(int i = 0; i < correctTestCases.size(); i++) {

			String current = returnFirst(stringTestCases.get(i));
			String currentC = stringTestCases.get(i);

			if(current.equals(correctTestCases.get(i))) {

				System.out.println("Test Case (" + currentC + ") " + ": " + current + " -->" + " ✓");

			}
			else {

				wrongs++;

				System.out.println("Test Case (" + currentC + ") " + ": " + current + " -->" + " x");

			}
		}

		System.out.println("Total wrongs: " + wrongs);

	}
}