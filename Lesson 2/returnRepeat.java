import java.util.*;
import java.lang.Math; 

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"


*/

public class word {

	public static String returnRepeat(String str, String sep, int count) {

		//write your code here;
		
	}

	public static void main(String[] args) {

		List<String> strCaseTest = Arrays.asList("Word", "This", "Something", "AAA" , "BBC");
		List<String> sepCaseTest = Arrays.asList("X", "And", "And", " ", "And");
		List<Integer> countTestCases = Arrays.asList(3,2,3,0,1);

		List<String> correctTestCases = Arrays.asList("WordXWordXWord", "ThisAndThis", "SomethingAndSomethingAndSomething", "", "BBC");

		int wrongs = 0;

		for(int i = 0; i< countTestCases.size(); i++) {

			String strCcase = strCaseTest.get(i);
			String sepCcase = sepCaseTest.get(i);
			int countCcase = countTestCases.get(i);

			String current = returnRepeat(strCaseTest.get(i), sepCaseTest.get(i), countTestCases.get(i));

			if(current.equals(correctTestCases.get(i))) {

				System.out.println("Test Case (" + strCcase + ", " + sepCcase + ", " + countCcase + ") " + ": " + current + " -->" + " ✓");
			}
			else {

				wrongs++;

				System.out.println("Test Case (" + strCcase + ", " + sepCcase + ", " + countCcase + ") " + ": " + current + " -->" + " x");
			}
		}

		System.out.println("Total wrongs : " + wrongs);
	}
}