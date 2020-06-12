import java.util.*;
import java.lang.Math; 

//return the biggest int

public class Biq {

	returnBiq(int a, int b, int c) {

		//here is where you write your code

	}

	public static void main(String[] args) {

		List<Integer> aTestCases = Arrays.asList(4,4,4,6,4,4,5,9,3,1,1);
		List<Integer> bTestCases = Arrays.asList(4,4,4,6,4,4,5,9,3,1,1);
		List<Integer> cTestCases = Arrays.asList(4,4,4,6,4,4,5,9,3,1,1);

		List<Integer> correctTestCases = Arrays.asList(4,4,4,6,4,4,5,9,3,1,1);

		int wrongs = 0;

		for(int i = 0; i<aTestCases.size();i++){

			int current = returnBiq(aTestCases.get(i), bTestCases.get(i), cTestCases.get(i));

			int a = aTestCases.get(i);
			int b = bTestCases.get(i);
			int c = cTestCases.get(i);
			int correct = correctTestCases.get(i);
 
			if(current == correctTestCases.get(i)){

				System.out.println("Test Case (" + a + ", " + b + ", " + c + ") " + ": " + current + " -->" + " ✓");

			}

			else {

				wrongs++;

				System.out.println("Test Case (" + a + ", " + b + ", " + c + ") " + ": " + current + " -->" + " x");

			}

		}

		System.out.println("Total Wrongs : " + wrongs);

	}

}
