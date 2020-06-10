import java.util.*;
import java.lang.Math; 

class Chocolate {

	public static int makeChocolate(int small, int big, int goal) {

		//here is where you write your code
		return -1;

	}

	public static void main(String[] args) {

		List<Integer> smallTestCases = Arrays.asList(4,4,4,6,4,4,5,9,3,1,1);
		List<Integer> largeTestCases = Arrays.asList(1,1,1,2,1,1,4,3,1,2,2);
		List<Integer> goalTestCases = Arrays.asList(9,10,7,7,5,4,9,18,9,7,6);

		List<Integer> correctTestCases = Arrays.asList(4,-1,2,2,0,4,4,3,-1,-1,1);

		int wrongs = 0;

		for(int i = 0; i<smallTestCases.size();i++){

			int current = makeChocolate(smallTestCases.get(i), largeTestCases.get(i), goalTestCases.get(i));

			int small = smallTestCases.get(i);
			int large = largeTestCases.get(i);
			int goal = goalTestCases.get(i);

			if(current == correctTestCases.get(i)){

				System.out.println("Test Case (" + small + ", " + large + ", " + goal + ") " + ": " + current + " -->" + " ✓");

			}

			else {

				wrongs++;

				System.out.println("Test Case (" + small + ", " + large + ", " + goal + ") " + ": " + current + " -->" + " x");

			}

		}

		System.out.println("Total Wrongs : " + wrongs);

	}

}