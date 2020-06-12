import java.util.*;
import java.lang.Math; 

/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), 
except for appearances of the word string which are preserved unchanged.

Examples:

returnHighlight("12xy34", "xy") → "++xy++"
returnHighlight("12xy34", "1") → "1+++++"
returnHighlight("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

*/

public class word {

	public static String returnHighlight(String str, String word) {

		//here is where you write your code
		
	}

	public static void main(String[] args) {

		List<String> strTestCases = Arrays.asList("12xy34", "12xy34", "12xy34xyabcxy","abXYabcXYZ", "--++ab", "123123");
		List<String> wordTestCases = Arrays.asList("xy", "1", "xy", "ab", "++", "3");

		List<String> correctTestCases = Arrays.asList("++xy++", "1+++++", "++xy++xy+++xy", "ab++ab++++", "++++++", "++3++3");

		int wrongs = 0;

		for(int i = 0; i <correctTestCases.size(); i++) {

			String current = returnHighlight(strTestCases.get(i), wordTestCases.get(i));

			String a = strTestCases.get(i);
			String b = wordTestCases.get(i);

			if(current.equals(correctTestCases.get(i))) {

				System.out.println("Test Case (" + a + ", " + b + ") " + ": " + current + " -->" + " ✓");

			}
			else {

				wrongs++;
				System.out.println("Test Case (" + a + ", " + b + ") " + ": " + current + " -->" + " x");

			}
		}
		System.out.println("Total wrongs : " + wrongs);
	}
}