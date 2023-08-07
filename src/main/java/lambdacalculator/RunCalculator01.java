package lambdacalculator;

import static lambdacalculator.Calculator.addOperation;

public class RunCalculator01 {

	public static void main(String[] args) {

		String exp = "9 * 9 - 1 * 7 / 8 + 30 ^ 2 % 3";
		addOperation("^", (a, b) -> (int) Math.pow(a, b));
		addOperation("%", (a, b) -> a % b);
		
		
		System.out.println(Calculator.calculate(exp));

	}

}
