import java.util.*;
import java.lang.Math; 

/*

Youre name is John and you are a really cool highschool student, and maybe a little autistic.  You like your numbers to
be even and a perfect square. 

You take is to take in an integer and determine if the number is even and if it is a perfect square. 
and only if both of these conditions are met, the return is true.

HINT: to find squareroot you use Math.sqrt(number)

Example 1:

INPUT: 64
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

		List<Integer> testCases = Arrays.asList(4,16,7,21,64,52,73,144);

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
Test Case 7: false
Test Case 8: true

*/