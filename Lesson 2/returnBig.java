import java.util.*;
import java.lang.Math; 


public class Biq {

	public static int returnBiq(int a, int b, int c) {

		//here is where you write your code
		if(a>b&&a>c) return a;
		if(b>a&&b>c) return b;
		else return c;

	}

	public static void main(String[] args) {

		List<Integer> aTestCases = Arrays.asList(1,1,3,9,3,3,8,-3,6,5,5);
		List<Integer> bTestCases = Arrays.asList(2,3,2,3,9,3,2,-1,2,6,2);
		List<Integer> cTestCases = Arrays.asList(3,2,1,3,3,9,3,-2,5,2,6);

		List<Integer> correctTestCases = Arrays.asList(3,3,3,9,9,9,8,-1,6,6,6);

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