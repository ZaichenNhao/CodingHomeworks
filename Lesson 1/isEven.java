import java.util.*;

/*

i don't really need to explain, you check to see if a number is even.

you will need to return a boolean value.

Example 1:

INPUT: 92
OUTPUT: True

Example 2:

INPUT: 21
OUTPUT: False

*/
public class Number {

	public static boolean isEven(int amount){

		//where you write your code

	}

	public static void main(String[] args) {

		List<Integer> testCases = Arrays.asList(12,64,99,67,24,1,62);

		for (int i = 0; i<testCases.size(); i++){

			int testc = i+1;
			boolean even = isEven(testCases.get(i));
			System.out.println("Test Case " + testc + ": " + even);
		}		
	}
}

/*

Your final output should look like this:

Test Case 1: true
Test Case 2: true
Test Case 3: false
Test Case 4: false
Test Case 5: true
Test Case 6: false
Test Case 7: true

*/