import java.util.*;

//instructions
/*
You are a cashier working at Walmart, and a customer hands you some money for their purchase. 
And you will have to tell them the different denomination of cash you can give back. 
For each of the  different denomations you will print back all possible denominations in a format of string.

You will return all possible denomination, however if you can't return the number in any denomination, 
return "I can't return your money in cash"

Constraint:

The denominations are 5,10,20,50,100

Example:

INPUT: 150
OUTPUT: "I can return your money in 5 10 50"

Example 2:

INPUT: 3
OUTPUT: "I can't return your money in cash"

*/

public class cashier {

	public static String returnDenomination(int Amount) {

		//write your code here

	}

	public static void main(String[] args) {
		List<Integer> testCases = Arrays.asList(350,3,500,231,245,45,18,95);

		for (int i = 0; i<testCases.size(); i++){

			int testc = i+1;

			String much = returnDenomination(testCases.get(i));
			System.out.println("Test Case " + testc + ": I can return your money in" + much);

		}
	}
}

/*

Your final output should be:
Test Case 1: I can return your money in 5 10 50
Test Case 2: I can't return your money in cash
Test Case 3: I can return your money in 5 10 20 50 100
Test Case 4: I can't return your money in cash
Test Case 5: I can return your money in 5
Test Case 6: I can return your money in 5
Test Case 7: I can't return your money in cash
Test Case 8: I can return your money in 5

*/